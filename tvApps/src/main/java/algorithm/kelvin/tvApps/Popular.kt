@file:Suppress("DEPRECATION")
package algorithm.kelvin.tvApps

import algorithm.kelvin.project.tvApps.BuildConfig
import algorithm.kelvin.project.tvApps.R
import algorithm.kelvin.tvApps.viewmodel.PopularViewModel
import algorithm.kelvin.tvApps.viewmodelfactory.TvVMFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import api.tv.ApiRepositoryTv
import com.bumptech.glide.Glide
import dataItem.adapter.setupAdapterData
import dataItem.data.Data
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.fragment_popular.*
import kotlinx.android.synthetic.main.item_data_tv.view.*

class Popular : Fragment() {
    private val popularViewModel by lazy {
        ViewModelProviders.of(this,
            TvVMFactory(tvRepository = ApiRepositoryTv(), compositeDisposable = CompositeDisposable(), type = "popular"))
            .get(PopularViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_popular, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvPopular.setupAdapterData<Data.ListCatalogTV>(R.layout.item_data_tv, requireContext()) {
            data {
                Glide.with(requireContext()).load("${BuildConfig.URL_POSTER}${item?.poster}").into(viewAdapterData.imgPosterTv)
                viewAdapterData.tvTitleTv.text = item?.title
                viewAdapterData.tvReleaseDateTv.text = item?.releaseDate
            }
            popularViewModel.getDataTv("popular").observe(requireContext() as LifecycleOwner, Observer {
                setData(it)
            })
            setLayoutManager(linearLayoutManager(), 0)
            setAdapter()
        }
    }
}

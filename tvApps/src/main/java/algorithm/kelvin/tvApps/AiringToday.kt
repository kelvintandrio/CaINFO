package algorithm.kelvin.tvApps

import algorithm.kelvin.project.tvApps.BuildConfig
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import algorithm.kelvin.project.tvApps.R
import algorithm.kelvin.tvApps.viewmodel.AiringTodayViewModel
import algorithm.kelvin.tvApps.viewmodelfactory.TvVMFactory
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import api.tv.ApiRepositoryTv
import com.bumptech.glide.Glide
import dataItem.adapter.setupAdapterData
import dataItem.data.Data
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.fragment_airing_today.*
import kotlinx.android.synthetic.main.item_data_tv.view.*

class AiringToday : Fragment() {
    private val airingTodayViewModel by lazy {
        ViewModelProviders.of(this,
            TvVMFactory(tvRepository = ApiRepositoryTv(), compositeDisposable = CompositeDisposable(), type = "airing today"))
            .get(AiringTodayViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_airing_today, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvAiringToday.setupAdapterData<Data.ListCatalogTV>(R.layout.item_data_tv) {
            data {
                Glide.with(requireContext()).load("${BuildConfig.URL_POSTER}${item?.poster}").into(viewAdapterData.imgPosterTv)
                viewAdapterData.tvTitleTv.text = item?.title
                viewAdapterData.tvReleaseDateTv.text = item?.releaseDate
            }
            airingTodayViewModel.getDataTv("airing today").observe(requireContext() as LifecycleOwner, Observer {
                setData(it)
            })
            setLayoutManager(linearLayoutManager(), 0)
            setAdapter()
        }
    }
}

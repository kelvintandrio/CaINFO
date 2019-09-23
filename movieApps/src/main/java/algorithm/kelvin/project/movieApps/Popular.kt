@file:Suppress("DEPRECATION")
package algorithm.kelvin.project.movieApps

import algorithm.kelvin.project.movieApps.viewmodel.PopularViewModel
import algorithm.kelvin.project.movieApps.vmfactory.MovieVMFactory
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import api.movie.ApiRepository
import com.bumptech.glide.Glide
import dataItem.adapter.setupAdapterData
import dataItem.data.Data
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.fragment_popular.*
import kotlinx.android.synthetic.main.item_data_movie.view.*

class Popular : Fragment() {
    private val popularViewModel by lazy {
        ViewModelProviders.of(this,
            MovieVMFactory(movieRepository = ApiRepository(), compositeDisposable = CompositeDisposable(), type = "popular"))
            .get(PopularViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_popular, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvPopular.setupAdapterData<Data.ListCatalog>(R.layout.item_data_movie, requireContext()) {
            data {
                Glide.with(requireContext()).load("${BuildConfig.URL_IMAGE}${item?.poster}").into(viewAdapterData.imgPosterMovie)
                viewAdapterData.tvTitleMovie.text = item?.title
                viewAdapterData.tvReleaseDateMovie.text = item?.releaseDate
            }
            popularViewModel.getDataMovie("popular").observe(requireContext() as LifecycleOwner, Observer {
                setData(it)
            })
            setLayoutManager(linearLayoutManager(), 0)
            setAdapter()
        }
    }
}

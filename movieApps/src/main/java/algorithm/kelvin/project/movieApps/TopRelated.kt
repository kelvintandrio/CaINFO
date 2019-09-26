@file:Suppress("DEPRECATION")

package algorithm.kelvin.project.movieApps

import algorithm.kelvin.project.movieApps.viewmodel.TopRelatedViewModel
import algorithm.kelvin.project.movieApps.vmfactory.MovieVMFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import api.movie.ApiRepository
import com.bumptech.glide.Glide
import dataItem.adapter.setupAdapterData
import dataItem.data.Data
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.fragment_related.*
import kotlinx.android.synthetic.main.item_data_movie.view.*

class TopRelated : Fragment() {
    private val topRelatedViewModel by lazy {
        ViewModelProviders.of(this,
            MovieVMFactory(movieRepository = ApiRepository(), compositeDisposable = CompositeDisposable(), type = "top related"))
            .get(TopRelatedViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_related, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvRelated.setupAdapterData<Data.ListCatalog>(R.layout.item_data_movie, requireContext()) {
            data {
                Glide.with(requireContext()).load("${BuildConfig.URL_IMAGE}${item?.poster}").into(viewAdapterData.imgPosterMovie)
                viewAdapterData.tvTitleMovie.text = item?.title
                viewAdapterData.tvReleaseDateMovie.text = item?.releaseDate
                viewAdapterData.setOnClickListener {
                    Toast.makeText(requireContext(), "You choose ${item?.title}", Toast.LENGTH_SHORT).show()
                }
            }
            topRelatedViewModel.getDataMovie("top related").observe(requireActivity(), Observer {
                setData(it)
            })
            setLayoutManager(linearLayoutManager(), 0)
            setAdapter()
        }
    }
}
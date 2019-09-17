@file:Suppress("DEPRECATION")
package algorithm.kelvin.project.ca_info.view

import algorithm.kelvin.project.ca_info.R
import algorithm.kelvin.project.ca_info.viewmodel.MovieViewModel
import algorithm.kelvin.project.ca_info.vmfactory.MovieVMFactory
import algorithm.kelvin.project.repository.BuildConfig
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
import kotlinx.android.synthetic.main.fragment_movie.*
import kotlinx.android.synthetic.main.item_data_movie.view.*

class MovieFragment : Fragment() {
    private val mainViewModel by lazy {
        ViewModelProviders.of(this,
            MovieVMFactory(movieRepository = ApiRepository(), compositeDisposable = CompositeDisposable())).get(MovieViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvMovie.setupAdapterData<Data.ListCatalog>(R.layout.item_data_movie) {
            data {
                Glide.with(requireContext()).load("${BuildConfig.URL_IMAGE}${item?.poster}").into(viewAdapterData.imgPosterMovie)
                viewAdapterData.tvTitleMovie.text = item?.title
                viewAdapterData.tvReleaseDateMovie.text = item?.releaseDate
                viewAdapterData.setOnClickListener {
                    Toast.makeText(requireContext(), "You choose ${item?.title}", Toast.LENGTH_SHORT).show()
                }
            }
            mainViewModel.getDataMovie("now playing").observe(requireActivity(), Observer {
                setData(it)
            })
            setLayoutManager(linearLayoutManager(), 0)
            setAdapter()
        }
    }
}

package algorithm.kelvin.project.ca_info.vmfactory

import algorithm.kelvin.project.ca_info.viewmodel.MovieViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import api.movie.ApiRepository
import io.reactivex.disposables.CompositeDisposable

@Suppress("UNCHECKED_CAST")
class MovieVMFactory(val movieRepository: ApiRepository, val compositeDisposable: CompositeDisposable): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T = MovieViewModel(movieRepository, compositeDisposable) as T
}
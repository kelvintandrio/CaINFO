package algorithm.kelvin.project.movieApps.vmfactory

import algorithm.kelvin.project.movieApps.viewmodel.NowPlayingViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import api.movie.ApiRepository
import io.reactivex.disposables.CompositeDisposable

@Suppress("UNCHECKED_CAST")
class NowPlayingVMFactory(val movieRepository: ApiRepository, val compositeDisposable: CompositeDisposable): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T = NowPlayingViewModel(movieRepository, compositeDisposable) as T
}
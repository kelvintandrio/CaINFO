package algorithm.kelvin.project.movieApps.vmfactory

import algorithm.kelvin.project.movieApps.viewmodel.NowPlayingViewModel
import algorithm.kelvin.project.movieApps.viewmodel.PopularViewModel
import algorithm.kelvin.project.movieApps.viewmodel.TopRelatedViewModel
import algorithm.kelvin.project.movieApps.viewmodel.UpcomingViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import api.movie.ApiRepository
import io.reactivex.disposables.CompositeDisposable

@Suppress("UNCHECKED_CAST")
class MovieVMFactory(val movieRepository: ApiRepository, val compositeDisposable: CompositeDisposable, private val type: String): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when(type) {
            "popular" -> PopularViewModel(movieRepository, compositeDisposable) as T
            "now playing" -> NowPlayingViewModel(movieRepository, compositeDisposable) as T
            "top related" -> TopRelatedViewModel(movieRepository, compositeDisposable) as T
            "up coming" -> UpcomingViewModel(movieRepository, compositeDisposable) as T
            else -> NowPlayingViewModel(movieRepository, compositeDisposable) as T
        }
    }
}
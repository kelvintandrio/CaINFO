package algorithm.kelvin.tvApps.viewmodelfactory

import algorithm.kelvin.tvApps.viewmodel.AiringTodayViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import api.movie.ApiRepository
import api.tv.ApiRepositoryTv
import io.reactivex.disposables.CompositeDisposable

@Suppress("UNCHECKED_CAST")
class TvVMFactory(val tvRepository: ApiRepositoryTv, val compositeDisposable: CompositeDisposable, private val type: String): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when(type) {
//            "popular" -> AiringTodayViewModel(tvRepository, compositeDisposable) as T
            "airing today" -> AiringTodayViewModel(tvRepository, compositeDisposable) as T
            else -> AiringTodayViewModel(tvRepository, compositeDisposable) as T
        }
    }
}
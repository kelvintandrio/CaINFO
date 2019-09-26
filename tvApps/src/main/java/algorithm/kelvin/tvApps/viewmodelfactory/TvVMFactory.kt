package algorithm.kelvin.tvApps.viewmodelfactory

import algorithm.kelvin.tvApps.viewmodel.AiringTodayViewModel
import algorithm.kelvin.tvApps.viewmodel.OnTheAirViewModel
import algorithm.kelvin.tvApps.viewmodel.PopularViewModel
import algorithm.kelvin.tvApps.viewmodel.TopRatedViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import api.tv.ApiRepositoryTv
import io.reactivex.disposables.CompositeDisposable

@Suppress("UNCHECKED_CAST")
class TvVMFactory(val tvRepository: ApiRepositoryTv, val compositeDisposable: CompositeDisposable, private val type: String): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when(type) {
            "popular" -> PopularViewModel(tvRepository, compositeDisposable) as T
            "airing today" -> AiringTodayViewModel(tvRepository, compositeDisposable) as T
            "on the air" -> OnTheAirViewModel(tvRepository, compositeDisposable) as T
            "top rated" -> TopRatedViewModel(tvRepository, compositeDisposable) as T
            else -> AiringTodayViewModel(tvRepository, compositeDisposable) as T
        }
    }
}
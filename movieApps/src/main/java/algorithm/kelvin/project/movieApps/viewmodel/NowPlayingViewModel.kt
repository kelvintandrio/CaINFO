package algorithm.kelvin.project.movieApps.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import api.movie.ApiRepository
import dataItem.data.Data
import io.reactivex.disposables.CompositeDisposable

class NowPlayingViewModel(private val movieRepository: ApiRepository, private val compositeDisposable: CompositeDisposable): ViewModel() {
    fun getDataMovie(type: String): LiveData<PagedList<Data.ListCatalog>> = movieRepository.getMovie(compositeDisposable, type)

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}
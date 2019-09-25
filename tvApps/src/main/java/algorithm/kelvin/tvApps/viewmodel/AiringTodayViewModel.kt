package algorithm.kelvin.tvApps.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import api.movie.ApiRepository
import api.tv.ApiRepositoryTv
import dataItem.data.Data
import io.reactivex.disposables.CompositeDisposable

class AiringTodayViewModel(private val tvRepository: ApiRepositoryTv, private val compositeDisposable: CompositeDisposable): ViewModel() {
    fun getDataTv(type: String): LiveData<PagedList<Data.ListCatalogTV>> = tvRepository.getTv(compositeDisposable, type)

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}
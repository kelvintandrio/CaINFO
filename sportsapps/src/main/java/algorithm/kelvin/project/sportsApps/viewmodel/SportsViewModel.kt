package algorithm.kelvin.project.sportsApps.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import api.sports.ApiRepositorySports
import dataItem.data.Data
import io.reactivex.disposables.CompositeDisposable

class SportsViewModel(private val sportsRepository: ApiRepositorySports, private val compositeDisposable: CompositeDisposable): ViewModel() {
    fun getAllSports(): LiveData<PagedList<Data.ListCatalogAllSports>> = sportsRepository.getAllSports(compositeDisposable)
}
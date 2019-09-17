package algorithm.kelvin.project.ca_info.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import api.movie.ApiRepository
import dataItem.data.Data
import io.reactivex.disposables.CompositeDisposable

class MovieViewModel(private val movieRepository: ApiRepository, private val compositeDisposable: CompositeDisposable): ViewModel() {
    fun getDataMovie(type: String): LiveData<PagedList<Data.ListCatalog>> = movieRepository.getMovie(compositeDisposable, type)
}
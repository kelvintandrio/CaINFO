package api.movie

import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import api.ApiService
import api.datasource.factory.DsfMovie
import dataItem.data.Data
import io.reactivex.disposables.CompositeDisposable

class ApiRepository: ApiInterface {
    private val apiService = ApiService.iniRetrofitMovie()
    override fun getMovie(compositeDisposable: CompositeDisposable, type: String): LiveData<PagedList<Data.ListCatalog>> =
        when(type) {
            "now playing" -> LivePagedListBuilder(DsfMovie(compositeDisposable, apiService.getDataMovieNowPlaying(), 0), 5).build()
            else -> LivePagedListBuilder(DsfMovie(compositeDisposable, apiService.getDataMovieNowPlaying(), 0), 5).build()
        }
}
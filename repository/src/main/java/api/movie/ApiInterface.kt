package api.movie

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import dataItem.data.Data
import io.reactivex.disposables.CompositeDisposable

interface ApiInterface {
    fun getMovie(compositeDisposable: CompositeDisposable, type: String): LiveData<PagedList<Data.ListCatalog>>
}
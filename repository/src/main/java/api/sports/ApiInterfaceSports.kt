package api.sports

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import dataItem.data.Data
import io.reactivex.disposables.CompositeDisposable

interface ApiInterfaceSports {
    fun getAllSports(compositeDisposable: CompositeDisposable): LiveData<PagedList<Data.ListCatalogAllSports>>
}
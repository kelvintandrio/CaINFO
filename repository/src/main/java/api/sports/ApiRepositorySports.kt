package api.sports

import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import api.ApiService
import api.datasource.factory.DsfMovie
import api.datasource.factory.DsfSports
import dataItem.data.Data
import io.reactivex.disposables.CompositeDisposable

class ApiRepositorySports: ApiInterfaceSports {
    private val apiService = ApiService.iniRetrofitSports()
    override fun getAllSports(compositeDisposable: CompositeDisposable): LiveData<PagedList<Data.ListCatalogAllSports>>
        = LivePagedListBuilder(DsfSports(compositeDisposable, apiService, 0, "none"), 5).build()
}
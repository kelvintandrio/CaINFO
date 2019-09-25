package api.tv

import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import api.ApiService
import api.datasource.factory.DsfTv
import dataItem.data.Data
import io.reactivex.disposables.CompositeDisposable

class ApiRepositoryTv: ApiInterfaceTv {
    private val apiService = ApiService.iniRetrofitTv()

    override fun getTv(compositeDisposable: CompositeDisposable, type: String): LiveData<PagedList<Data.ListCatalogTV>> =
       LivePagedListBuilder(DsfTv(compositeDisposable, apiService, 0, type), 5).build()
}
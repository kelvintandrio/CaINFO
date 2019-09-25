package api.tv

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import dataItem.data.Data
import io.reactivex.disposables.CompositeDisposable

interface ApiInterfaceTv {
    fun getTv(compositeDisposable: CompositeDisposable, type: String): LiveData<PagedList<Data.ListCatalogTV>>
}
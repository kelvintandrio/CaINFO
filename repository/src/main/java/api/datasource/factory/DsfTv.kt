package api.datasource.factory

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import api.datasource.ds.DsTv
import api.tv.RestApiTv
import dataItem.data.Data
import io.reactivex.disposables.CompositeDisposable

class DsfTv(private val compositeDisposable: CompositeDisposable,
            private val apiService: RestApiTv,
            private val id: Int,
            private val typeMovie: String): DataSource.Factory<Int?, Data.ListCatalogTV>() {
    private val dsTv = MutableLiveData<DsTv>()

    override fun create(): DataSource<Int?, Data.ListCatalogTV> {
        val dsRelatedTv = DsTv(compositeDisposable, apiService, id, typeMovie)
        dsTv.postValue(dsRelatedTv)
        return dsRelatedTv
    }
}
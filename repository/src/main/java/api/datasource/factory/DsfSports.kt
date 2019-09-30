package api.datasource.factory

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import api.datasource.ds.DsMovie
import api.datasource.ds.DsSports
import api.sports.RestApiSports
import api.tv.RestApiTv
import dataItem.data.Data
import io.reactivex.disposables.CompositeDisposable

class DsfSports(private val compositeDisposable: CompositeDisposable,
                private val apiService: RestApiSports,
                private val id: Int,
                private val typeMovie: String): DataSource.Factory<Int?, Data.ListCatalogAllSports>() {
    private val dsSports = MutableLiveData<DsSports>()

    override fun create(): DataSource<Int?, Data.ListCatalogAllSports> {
        val dsRelatedSports = DsSports(compositeDisposable, apiService, id, typeMovie)
        dsSports.postValue(dsRelatedSports)
        return dsRelatedSports
    }
}
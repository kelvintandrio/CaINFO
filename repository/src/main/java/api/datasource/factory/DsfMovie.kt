package api.datasource.factory

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import api.datasource.ds.DsMovie
import api.movie.RestApiMovie
import dataItem.data.Data
import io.reactivex.disposables.CompositeDisposable

class DsfMovie(private val compositeDisposable: CompositeDisposable,
               private val apiService: RestApiMovie,
               private val id: Int,
               private val typeMovie: String): DataSource.Factory<Int?, Data.ListCatalog>() {
    private val dsMovie = MutableLiveData<DsMovie>()

    override fun create(): DataSource<Int?, Data.ListCatalog> {
        val dsRelatedMovie = DsMovie(compositeDisposable, apiService, id, typeMovie)
        dsMovie.postValue(dsRelatedMovie)
        return dsRelatedMovie
    }
}
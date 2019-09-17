package api.datasource.factory

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import api.datasource.ds.DsMovie
import dataItem.data.Data
import dataItem.data.Movie
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable

class DsfMovie(private val compositeDisposable: CompositeDisposable,
               private val observable: Observable<Movie>,
               private val id: Int): DataSource.Factory<String?, Data.ListCatalog>() {
    private val dsMovie = MutableLiveData<DsMovie>()

    override fun create(): DataSource<String?, Data.ListCatalog> {
        val dsRelatedMovie = DsMovie(compositeDisposable, observable, id)
        dsMovie.postValue(dsRelatedMovie)
        return dsRelatedMovie
    }
}
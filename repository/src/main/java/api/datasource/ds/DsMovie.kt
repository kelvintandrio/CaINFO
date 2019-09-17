package api.datasource.ds

import android.util.Log
import androidx.paging.ItemKeyedDataSource
import dataItem.data.Data
import dataItem.data.Movie
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class DsMovie(private val compositeDisposable: CompositeDisposable,
              private val observable: Observable<Movie>,
              private val id: Int): ItemKeyedDataSource<String?, Data.ListCatalog>() {

    override fun loadInitial(params: LoadInitialParams<String?>, callback: LoadInitialCallback<Data.ListCatalog>) {
        compositeDisposable.add(
            observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map {
                    when(id) {
                        0 -> it.dataMovie
                        else -> it.dataMovie
                    }
                }
                .subscribe(
                    {
                        it?.let { it1 -> callback.onResult(it1) }
                    },
                    {
                        Log.i("Get Error", "Error to get Data")
                    }
                )
        )
    }

    override fun loadAfter(params: LoadParams<String?>, callback: LoadCallback<Data.ListCatalog>) { }

    override fun loadBefore(params: LoadParams<String?>, callback: LoadCallback<Data.ListCatalog>) { }

    override fun getKey(item: Data.ListCatalog): String = item.id.toString()
}
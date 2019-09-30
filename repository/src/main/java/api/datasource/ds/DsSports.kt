package api.datasource.ds

import android.util.Log
import androidx.paging.ItemKeyedDataSource
import androidx.paging.PageKeyedDataSource
import api.sports.RestApiSports
import api.tv.RestApiTv
import dataItem.data.Data
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class DsSports(private val compositeDisposable: CompositeDisposable,
               private val apiService: RestApiSports,
               private val id: Int,
               private val type: String): ItemKeyedDataSource<Int?, Data.ListCatalogAllSports>() {
    override fun loadInitial(params: LoadInitialParams<Int?>, callback: LoadInitialCallback<Data.ListCatalogAllSports>) {
        compositeDisposable.add(
            apiService.getDataAllSports()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map { it.dataSports }
                .subscribe(
                    {
                        it?.let { it1 ->
                            callback.onResult(it1)
                        }
                    },
                    {
                        Log.i("Get Error", "Error to get Data")
                    }
                )
        )
    }

    override fun loadAfter(params: LoadParams<Int?>, callback: LoadCallback<Data.ListCatalogAllSports>) { }

    override fun loadBefore(params: LoadParams<Int?>, callback: LoadCallback<Data.ListCatalogAllSports>) { }

    override fun getKey(item: Data.ListCatalogAllSports): Int = item.id!!
}
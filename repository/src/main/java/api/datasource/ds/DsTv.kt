package api.datasource.ds

import android.util.Log
import androidx.paging.PageKeyedDataSource
import api.tv.RestApiTv
import dataItem.data.Data
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class DsTv(private val compositeDisposable: CompositeDisposable,
           private val apiService: RestApiTv,
           private val id: Int,
           private val typeTv: String): PageKeyedDataSource<Int?, Data.ListCatalogTV>()  {
    private var page = 1

    override fun loadInitial(params: LoadInitialParams<Int?>, callback: LoadInitialCallback<Int?, Data.ListCatalogTV>) {
        val observable = setObservableTv(typeTv, page)
        compositeDisposable.add(
            observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map {
                    when(id) {
                        0 -> it.dataTV
                        else -> it.dataTV
                    }
                }
                .subscribe(
                    {
                        it?.let { it1 ->
                            Log.i("Get Data Success", "Success get data")
                            callback.onResult(it1, null, ++page)
                        }
                    },
                    {
                        Log.i("Get Error", "Error to get Data")
                    }
                )
        )
    }

    override fun loadAfter(params: LoadParams<Int?>, callback: LoadCallback<Int?, Data.ListCatalogTV>) {
        val observable = setObservableTv(typeTv, page)
        compositeDisposable.add(
            observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map {
                    when(id) {
                        0 -> it.dataTV
                        else -> it.dataTV
                    }
                }
                .subscribe(
                    {
                        if(2 >= params.key) {
                            it?.let { it1 ->
                                Log.i("Get Data Success", "Success get data")
                                callback.onResult(it1, ++page)
                            }
                        }
                    },
                    {
                        Log.i("Get Error", "Error to get Data")
                    }
                )
        )
    }

    override fun loadBefore(params: LoadParams<Int?>, callback: LoadCallback<Int?, Data.ListCatalogTV>) { }

    private fun setObservableTv(type: String, page: Int) = when(type) {
        "airing today" -> apiService.getDataTvAiringToday(page)
        else -> apiService.getDataTvAiringToday(page)
    }
}
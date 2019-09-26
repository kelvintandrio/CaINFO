package api.datasource.ds

import android.util.Log
import androidx.paging.PageKeyedDataSource
import api.movie.RestApiMovie
import dataItem.data.Data
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class DsMovie(private val compositeDisposable: CompositeDisposable,
              private val apiService: RestApiMovie,
              private val id: Int,
              private val typeMovie: String): PageKeyedDataSource<Int?, Data.ListCatalog>() {
    private var page = 1

    override fun loadInitial(params: LoadInitialParams<Int?>, callback: LoadInitialCallback<Int?, Data.ListCatalog>) {
        val observable = setObservableMovie(typeMovie, page)
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

    override fun loadAfter(params: LoadParams<Int?>, callback: LoadCallback<Int?, Data.ListCatalog>) {
        val observable = setObservableMovie(typeMovie, page)
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

    override fun loadBefore(params: LoadParams<Int?>, callback: LoadCallback<Int?, Data.ListCatalog>) { }

    private fun setObservableMovie(type: String, page: Int) = when(type) {
        "now playing" -> apiService.getDataMovieNowPlaying(page)
        "top related" -> apiService.getDataMovieTopRelated(page)
        "up coming" -> apiService.getDataMovieUpcoming(page)
        "popular" -> apiService.getDataMoviePopular(page)
        else -> apiService.getDataMovieNowPlaying(page)
    }
}
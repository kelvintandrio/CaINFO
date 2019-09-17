package api

import algorithm.kelvin.project.repository.BuildConfig
import api.movie.RestApiMovie
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object ApiService {
    fun iniRetrofitMovie(): RestApiMovie {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.URL_MOVIE_CATALOG)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(RestApiMovie::class.java)
    }
}
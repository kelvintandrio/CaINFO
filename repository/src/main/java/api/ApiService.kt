package api

import algorithm.kelvin.project.repository.BuildConfig
import api.movie.RestApiMovie
import api.sports.RestApiSports
import api.tv.RestApiTv
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

    fun iniRetrofitTv(): RestApiTv {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.URL_MOVIE_CATALOG)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(RestApiTv::class.java)
    }

    fun iniRetrofitSports(): RestApiSports {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.URL_SPORTS_CATALOG)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(RestApiSports::class.java)
    }
}
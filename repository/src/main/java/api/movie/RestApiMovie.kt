package api.movie

import algorithm.kelvin.project.repository.BuildConfig
import dataItem.data.Movie
import io.reactivex.Observable
import retrofit2.http.GET

interface RestApiMovie {
    @GET("/3/movie/now_playing?api_key=${BuildConfig.API_KEY}&language=en-US ")
    fun getDataMovieNowPlaying() : Observable<Movie>

    @GET("/3/movie/top_rated?api_key=${BuildConfig.API_KEY}&language=en-US ")
    fun getDataMovieTopRelated() : Observable<Movie>

    @GET("/3/movie/upcoming?api_key=${BuildConfig.API_KEY}&language=en-US ")
    fun getDataMovieUpcoming() : Observable<Movie>

    @GET("/3/movie/popular?api_key=${BuildConfig.API_KEY}&language=en-US ")
    fun getDataMoviePopular() : Observable<Movie>
}
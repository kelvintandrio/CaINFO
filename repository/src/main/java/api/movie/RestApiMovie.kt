package api.movie

import algorithm.kelvin.project.repository.BuildConfig
import dataItem.data.Movie
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface RestApiMovie {
    @GET("/3/movie/now_playing?api_key=${BuildConfig.API_KEY}&language=en-US")
    fun getDataMovieNowPlaying(@Query("page") page: Int) : Observable<Movie>

    @GET("/3/movie/top_rated?api_key=${BuildConfig.API_KEY}&language=en-US")
    fun getDataMovieTopRelated(@Query("page") page: Int) : Observable<Movie>

    @GET("/3/movie/upcoming?api_key=${BuildConfig.API_KEY}&language=en-US")
    fun getDataMovieUpcoming(@Query("page") page: Int) : Observable<Movie>

    @GET("/3/movie/popular?api_key=${BuildConfig.API_KEY}&language=en-US")
    fun getDataMoviePopular(@Query("page") page: Int) : Observable<Movie>
}
package api.movie

import algorithm.kelvin.project.repository.BuildConfig
import dataItem.data.Movie
import io.reactivex.Observable
import retrofit2.http.GET

interface RestApiMovie {
    @GET("/3/movie/now_playing?api_key=${BuildConfig.API_KEY}&language=en-US ")
    fun getDataMovieNowPlaying() : Observable<Movie>
}
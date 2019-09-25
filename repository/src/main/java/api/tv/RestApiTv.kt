package api.tv

import algorithm.kelvin.project.repository.BuildConfig
import dataItem.data.TV
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface RestApiTv {
    @GET("/3/tv/airing_today?api_key=${BuildConfig.API_KEY}&language=en-US")
    fun getDataTvAiringToday(@Query("page") page: Int) : Observable<TV>
}
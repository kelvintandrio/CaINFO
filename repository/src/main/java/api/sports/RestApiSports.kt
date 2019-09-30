package api.sports

import dataItem.data.Sports
import io.reactivex.Observable
import retrofit2.http.GET

interface RestApiSports {
    @GET("/api/v1/json/1/all_sports.php")
    fun getDataAllSports() : Observable<Sports>
}
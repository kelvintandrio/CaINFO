package api.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lapi/movie/RestApiMovie;", "", "getDataMovieNowPlaying", "Lio/reactivex/Observable;", "LdataItem/data/Movie;", "repository_debug"})
public abstract interface RestApiMovie {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/now_playing?api_key=5a9914ea9eb3bfc1addfe13b0b92b0b4&language=en-US ")
    public abstract io.reactivex.Observable<dataItem.data.Movie> getDataMovieNowPlaying();
}
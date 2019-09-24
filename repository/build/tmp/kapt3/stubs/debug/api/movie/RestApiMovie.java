package api.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\n"}, d2 = {"Lapi/movie/RestApiMovie;", "", "getDataMovieNowPlaying", "Lio/reactivex/Observable;", "LdataItem/data/Movie;", "page", "", "getDataMoviePopular", "getDataMovieTopRelated", "getDataMovieUpcoming", "repository_debug"})
public abstract interface RestApiMovie {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/now_playing?api_key=5a9914ea9eb3bfc1addfe13b0b92b0b4&language=en-US")
    public abstract io.reactivex.Observable<dataItem.data.Movie> getDataMovieNowPlaying(@retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/top_rated?api_key=5a9914ea9eb3bfc1addfe13b0b92b0b4&language=en-US")
    public abstract io.reactivex.Observable<dataItem.data.Movie> getDataMovieTopRelated(@retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/upcoming?api_key=5a9914ea9eb3bfc1addfe13b0b92b0b4&language=en-US")
    public abstract io.reactivex.Observable<dataItem.data.Movie> getDataMovieUpcoming(@retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/popular?api_key=5a9914ea9eb3bfc1addfe13b0b92b0b4&language=en-US")
    public abstract io.reactivex.Observable<dataItem.data.Movie> getDataMoviePopular(@retrofit2.http.Query(value = "page")
    int page);
}
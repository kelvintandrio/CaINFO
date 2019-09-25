package api.tv;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lapi/tv/RestApiTv;", "", "getDataTvAiringToday", "Lio/reactivex/Observable;", "LdataItem/data/TV;", "page", "", "repository_debug"})
public abstract interface RestApiTv {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/tv/airing_today?api_key=5a9914ea9eb3bfc1addfe13b0b92b0b4&language=en-US")
    public abstract io.reactivex.Observable<dataItem.data.TV> getDataTvAiringToday(@retrofit2.http.Query(value = "page")
    int page);
}
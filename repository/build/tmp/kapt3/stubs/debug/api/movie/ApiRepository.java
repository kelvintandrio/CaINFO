package api.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lapi/movie/ApiRepository;", "Lapi/movie/ApiInterface;", "()V", "apiService", "Lapi/movie/RestApiMovie;", "getMovie", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "LdataItem/data/Data$ListCatalog;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "type", "", "repository_debug"})
public final class ApiRepository implements api.movie.ApiInterface {
    private final api.movie.RestApiMovie apiService = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<androidx.paging.PagedList<dataItem.data.Data.ListCatalog>> getMovie(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    public ApiRepository() {
        super();
    }
}
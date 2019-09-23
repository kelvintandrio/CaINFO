package algorithm.kelvin.project.movieApps.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lalgorithm/kelvin/project/movieApps/viewmodel/TopRelatedViewModel;", "Landroidx/lifecycle/ViewModel;", "movieRepository", "Lapi/movie/ApiRepository;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lapi/movie/ApiRepository;Lio/reactivex/disposables/CompositeDisposable;)V", "getDataMovie", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "LdataItem/data/Data$ListCatalog;", "type", "", "onCleared", "", "movieApps_debug"})
public final class TopRelatedViewModel extends androidx.lifecycle.ViewModel {
    private final api.movie.ApiRepository movieRepository = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<dataItem.data.Data.ListCatalog>> getDataMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public TopRelatedViewModel(@org.jetbrains.annotations.NotNull()
    api.movie.ApiRepository movieRepository, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable) {
        super();
    }
}
package api.datasource.factory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lapi/datasource/factory/DsfTv;", "Landroidx/paging/DataSource$Factory;", "", "LdataItem/data/Data$ListCatalogTV;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "apiService", "Lapi/tv/RestApiTv;", "id", "typeMovie", "", "(Lio/reactivex/disposables/CompositeDisposable;Lapi/tv/RestApiTv;ILjava/lang/String;)V", "dsTv", "Landroidx/lifecycle/MutableLiveData;", "Lapi/datasource/ds/DsTv;", "create", "Landroidx/paging/DataSource;", "repository_debug"})
public final class DsfTv extends androidx.paging.DataSource.Factory<java.lang.Integer, dataItem.data.Data.ListCatalogTV> {
    private final androidx.lifecycle.MutableLiveData<api.datasource.ds.DsTv> dsTv = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final api.tv.RestApiTv apiService = null;
    private final int id = 0;
    private final java.lang.String typeMovie = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.DataSource<java.lang.Integer, dataItem.data.Data.ListCatalogTV> create() {
        return null;
    }
    
    public DsfTv(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    api.tv.RestApiTv apiService, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String typeMovie) {
        super();
    }
}
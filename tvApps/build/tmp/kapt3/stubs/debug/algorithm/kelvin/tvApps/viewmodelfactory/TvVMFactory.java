package algorithm.kelvin.tvApps.viewmodelfactory;

import java.lang.System;

@kotlin.Suppress(names = {"UNCHECKED_CAST"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\'\u0010\r\u001a\u0002H\u000e\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0016\u00a2\u0006\u0002\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lalgorithm/kelvin/tvApps/viewmodelfactory/TvVMFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "tvRepository", "Lapi/tv/ApiRepositoryTv;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "type", "", "(Lapi/tv/ApiRepositoryTv;Lio/reactivex/disposables/CompositeDisposable;Ljava/lang/String;)V", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "getTvRepository", "()Lapi/tv/ApiRepositoryTv;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "tvApps_debug"})
public final class TvVMFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    @org.jetbrains.annotations.NotNull()
    private final api.tv.ApiRepositoryTv tvRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final java.lang.String type = null;
    
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final api.tv.ApiRepositoryTv getTvRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    public TvVMFactory(@org.jetbrains.annotations.NotNull()
    api.tv.ApiRepositoryTv tvRepository, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        super();
    }
}
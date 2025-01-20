package my.app.bikesapp.data.repositories;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003H\u00c2\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086@\u00a2\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0011H\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lmy/app/bikesapp/data/repositories/BikeCompaniesRepository;", "", "service", "Lmy/app/bikesapp/networking/NetworkService;", "(Lmy/app/bikesapp/networking/NetworkService;)V", "component1", "copy", "equals", "", "other", "getBikeCompanies", "Lretrofit2/Response;", "Lmy/app/bikesapp/data/models/CompaniesData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStations", "Lmy/app/bikesapp/data/models/StationsData;", "networkId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hashCode", "", "toString", "app_debug"})
public final class BikeCompaniesRepository {
    @org.jetbrains.annotations.NotNull()
    private final my.app.bikesapp.networking.NetworkService service = null;
    
    private final my.app.bikesapp.networking.NetworkService component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final my.app.bikesapp.data.repositories.BikeCompaniesRepository copy(@org.jetbrains.annotations.NotNull()
    my.app.bikesapp.networking.NetworkService service) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @javax.inject.Inject()
    public BikeCompaniesRepository(@org.jetbrains.annotations.NotNull()
    my.app.bikesapp.networking.NetworkService service) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBikeCompanies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<my.app.bikesapp.data.models.CompaniesData>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getStations(@org.jetbrains.annotations.Nullable()
    java.lang.String networkId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<my.app.bikesapp.data.models.StationsData>> $completion) {
        return null;
    }
}
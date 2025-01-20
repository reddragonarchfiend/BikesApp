package my.app.bikesapp.networking;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH\u00a7@\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lmy/app/bikesapp/networking/NetworkService;", "", "getBikeCompanies", "Lretrofit2/Response;", "Lmy/app/bikesapp/data/models/CompaniesData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStations", "Lmy/app/bikesapp/data/models/StationsData;", "networkId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NetworkService {
    
    @retrofit2.http.GET(value = "networks")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBikeCompanies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<my.app.bikesapp.data.models.CompaniesData>> $completion);
    
    @retrofit2.http.GET(value = "networks/{network_id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStations(@retrofit2.http.Path(value = "network_id")
    @org.jetbrains.annotations.Nullable()
    java.lang.String networkId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<my.app.bikesapp.data.models.StationsData>> $completion);
}
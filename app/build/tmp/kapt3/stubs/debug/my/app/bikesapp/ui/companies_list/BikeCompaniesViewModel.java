package my.app.bikesapp.ui.companies_list;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u001a\u001a\u00020\u001b2\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0082@\u00a2\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u001bH\u0082@\u00a2\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020\u001bH\u0082@\u00a2\u0006\u0002\u0010\u001fJ\u0006\u0010!\u001a\u00020\u001bJ\b\u0010\"\u001a\u00020\u0010H\u0002J\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0013R\u001e\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0014\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lmy/app/bikesapp/ui/companies_list/BikeCompaniesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lmy/app/bikesapp/data/repositories/BikeCompaniesRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "companyCacheDao", "Lmy/app/bikesapp/db/CompanyCacheDao;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lmy/app/bikesapp/data/repositories/BikeCompaniesRepository;Landroid/content/SharedPreferences;Lmy/app/bikesapp/db/CompanyCacheDao;Landroidx/lifecycle/SavedStateHandle;)V", "_bikeCompaniesList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lmy/app/bikesapp/data/models/BikeCompany;", "_isRefreshing", "", "_query", "Lkotlinx/coroutines/flow/StateFlow;", "", "bikeCompaniesList", "getBikeCompaniesList", "()Lkotlinx/coroutines/flow/StateFlow;", "isRefreshing", "query", "getQuery", "cacheBikeCompanies", "", "networks", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAndCacheBikeCompanies", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filterListFromDatabase", "getBikeCompanies", "isCacheValid", "setQuery", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class BikeCompaniesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final my.app.bikesapp.data.repositories.BikeCompaniesRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull()
    private final my.app.bikesapp.db.CompanyCacheDao companyCacheDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<my.app.bikesapp.data.models.BikeCompany>> _bikeCompaniesList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<my.app.bikesapp.data.models.BikeCompany>> bikeCompaniesList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isRefreshing = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isRefreshing = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> _query = null;
    
    @javax.inject.Inject()
    public BikeCompaniesViewModel(@org.jetbrains.annotations.NotNull()
    my.app.bikesapp.data.repositories.BikeCompaniesRepository repository, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    my.app.bikesapp.db.CompanyCacheDao companyCacheDao, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<my.app.bikesapp.data.models.BikeCompany>> getBikeCompaniesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isRefreshing() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getQuery() {
        return null;
    }
    
    public final void getBikeCompanies() {
    }
    
    private final boolean isCacheValid() {
        return false;
    }
    
    private final java.lang.Object fetchAndCacheBikeCompanies(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object cacheBikeCompanies(java.util.List<my.app.bikesapp.data.models.BikeCompany> networks, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object filterListFromDatabase(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void setQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
}
package my.app.bikesapp.ui.map.helpers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002JF\u0010\u000f\u001a\u00020\u00102 \u0010\u0011\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00100\u00122\u001a\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017\u0012\u0004\u0012\u00020\u00100\u0012H\u0002JF\u0010\u0018\u001a\u00020\u00102 \u0010\u0011\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00100\u00122\u001a\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017\u0012\u0004\u0012\u00020\u00100\u0012H\u0007JF\u0010\u0019\u001a\u00020\u00102 \u0010\u0011\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00100\u00122\u001a\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017\u0012\u0004\u0012\u00020\u00100\u0012H\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J$\u0010\u001c\u001a\u00020\u00102\u000e\u0010\u001d\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001fJ\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lmy/app/bikesapp/ui/map/helpers/LocationHandler;", "", "context", "Landroid/content/Context;", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mapViewModel", "Lmy/app/bikesapp/ui/map/MapViewModel;", "resolutionLauncher", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "(Landroid/content/Context;Lcom/google/android/gms/location/FusedLocationProviderClient;Lmy/app/bikesapp/ui/map/MapViewModel;Landroidx/activity/compose/ManagedActivityResultLauncher;)V", "areLocationPermissionsGranted", "", "checkLocationSettings", "", "onSuccess", "Lkotlin/Function1;", "Lkotlin/Pair;", "", "onFailure", "Ljava/lang/Exception;", "Lkotlin/Exception;", "fetchCurrentLocation", "fetchLastLocation", "getPriority", "", "handleException", "exception", "onFailed", "Lkotlin/Function0;", "isPreciseLocationGranted", "app_debug"})
public final class LocationHandler {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient = null;
    @org.jetbrains.annotations.NotNull()
    private final my.app.bikesapp.ui.map.MapViewModel mapViewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.compose.ManagedActivityResultLauncher<androidx.activity.result.IntentSenderRequest, androidx.activity.result.ActivityResult> resolutionLauncher = null;
    
    public LocationHandler(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient, @org.jetbrains.annotations.NotNull()
    my.app.bikesapp.ui.map.MapViewModel mapViewModel, @org.jetbrains.annotations.NotNull()
    androidx.activity.compose.ManagedActivityResultLauncher<androidx.activity.result.IntentSenderRequest, androidx.activity.result.ActivityResult> resolutionLauncher) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void fetchCurrentLocation(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Pair<java.lang.Double, java.lang.Double>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit> onFailure) {
    }
    
    private final void checkLocationSettings(kotlin.jvm.functions.Function1<? super kotlin.Pair<java.lang.Double, java.lang.Double>, kotlin.Unit> onSuccess, kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit> onFailure) {
    }
    
    private final boolean areLocationPermissionsGranted(android.content.Context context) {
        return false;
    }
    
    private final boolean isPreciseLocationGranted(android.content.Context context) {
        return false;
    }
    
    private final int getPriority(android.content.Context context) {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void fetchLastLocation(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Pair<java.lang.Double, java.lang.Double>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit> onFailure) {
    }
    
    public final void handleException(@org.jetbrains.annotations.Nullable()
    java.lang.Exception exception, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFailed) {
    }
}
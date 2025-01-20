package my.app.bikesapp.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0082\bJ4\u0010\t\u001a\u0004\u0018\u0001H\n\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u0001*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u0001H\nH\u0086\n\u00a2\u0006\u0002\u0010\u000eJ\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0005J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0005\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0086\u0002J\u0019\u0010\u0015\u001a\u00020\u0004*\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u0004*\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0017\u00a8\u0006\u0019"}, d2 = {"Lmy/app/bikesapp/util/PreferenceHelper;", "", "()V", "edit", "", "Landroid/content/SharedPreferences;", "operation", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "get", "T", "key", "", "defaultValue", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getCacheExpiry", "", "getLastFetchedAt", "(Landroid/content/SharedPreferences;)Ljava/lang/Long;", "set", "value", "setCacheExpiry", "cacheExpiryMillis", "(Landroid/content/SharedPreferences;Ljava/lang/Long;)V", "setLastFetchedAt", "app_debug"})
public final class PreferenceHelper {
    @org.jetbrains.annotations.NotNull()
    public static final my.app.bikesapp.util.PreferenceHelper INSTANCE = null;
    
    private PreferenceHelper() {
        super();
    }
    
    private final void edit(android.content.SharedPreferences $this$edit, kotlin.jvm.functions.Function1<? super android.content.SharedPreferences.Editor, kotlin.Unit> operation) {
    }
    
    /**
     * puts a key value pair in shared prefs if doesn't exists, otherwise updates value on given [key]
     */
    public final void set(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $this$set, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    public final long getCacheExpiry(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $this$getCacheExpiry) {
        return 0L;
    }
    
    public final void setCacheExpiry(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $this$setCacheExpiry, @org.jetbrains.annotations.Nullable()
    java.lang.Long cacheExpiryMillis) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLastFetchedAt(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $this$getLastFetchedAt) {
        return null;
    }
    
    public final void setLastFetchedAt(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $this$setLastFetchedAt, @org.jetbrains.annotations.Nullable()
    java.lang.Long cacheExpiryMillis) {
    }
}
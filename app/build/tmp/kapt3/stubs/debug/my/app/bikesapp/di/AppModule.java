package my.app.bikesapp.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0013H\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0012\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\"\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u000eH\u0007J9\u0010\u001f\u001a\u0002H \"\u0004\b\u0000\u0010 2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H 0\"2\u0006\u0010\t\u001a\u00020\nH\u0002\u00a2\u0006\u0002\u0010#J\u001a\u0010$\u001a\u00020%2\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0019H\u0007\u00a8\u0006\'"}, d2 = {"Lmy/app/bikesapp/di/AppModule;", "", "()V", "createRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "Lokhttp3/OkHttpClient;", "converterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "context", "Landroid/content/Context;", "provideAppDatabase", "Lmy/app/bikesapp/db/AppDatabase;", "provideAuthInterceptor", "Lmy/app/bikesapp/networking/AuthInterceptor;", "provideCompanyCacheDao", "Lmy/app/bikesapp/db/CompanyCacheDao;", "appDatabase", "provideGson", "Lcom/google/gson/Gson;", "provideGsonConverterFactory", "gson", "provideLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideMasterKey", "Landroidx/security/crypto/MasterKey;", "provideNetworkService", "Lmy/app/bikesapp/networking/NetworkService;", "provideOkHttpClient", "interceptor", "authInterceptor", "provideService", "T", "clazz", "Ljava/lang/Class;", "(Lokhttp3/OkHttpClient;Lretrofit2/converter/gson/GsonConverterFactory;Ljava/lang/Class;Landroid/content/Context;)Ljava/lang/Object;", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "masterKey", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final my.app.bikesapp.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor interceptor, @org.jetbrains.annotations.NotNull()
    my.app.bikesapp.networking.AuthInterceptor authInterceptor) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final my.app.bikesapp.networking.AuthInterceptor provideAuthInterceptor() {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.logging.HttpLoggingInterceptor provideLoggingInterceptor() {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences provideSharedPreferences(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.security.crypto.MasterKey masterKey) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final androidx.security.crypto.MasterKey provideMasterKey(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.converter.gson.GsonConverterFactory provideGsonConverterFactory(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final my.app.bikesapp.networking.NetworkService provideNetworkService(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    retrofit2.converter.gson.GsonConverterFactory converterFactory, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final retrofit2.Retrofit createRetrofit(okhttp3.OkHttpClient okHttpClient, retrofit2.converter.gson.GsonConverterFactory converterFactory, android.content.Context context) {
        return null;
    }
    
    private final <T extends java.lang.Object>T provideService(okhttp3.OkHttpClient okHttpClient, retrofit2.converter.gson.GsonConverterFactory converterFactory, java.lang.Class<T> clazz, android.content.Context context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final my.app.bikesapp.db.AppDatabase provideAppDatabase(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final my.app.bikesapp.db.CompanyCacheDao provideCompanyCacheDao(@org.jetbrains.annotations.NotNull()
    my.app.bikesapp.db.AppDatabase appDatabase) {
        return null;
    }
}
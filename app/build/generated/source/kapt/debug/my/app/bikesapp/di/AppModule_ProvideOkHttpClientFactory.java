package my.app.bikesapp.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import my.app.bikesapp.networking.AuthInterceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class AppModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<HttpLoggingInterceptor> interceptorProvider;

  private final Provider<AuthInterceptor> authInterceptorProvider;

  public AppModule_ProvideOkHttpClientFactory(Provider<HttpLoggingInterceptor> interceptorProvider,
      Provider<AuthInterceptor> authInterceptorProvider) {
    this.interceptorProvider = interceptorProvider;
    this.authInterceptorProvider = authInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(interceptorProvider.get(), authInterceptorProvider.get());
  }

  public static AppModule_ProvideOkHttpClientFactory create(
      Provider<HttpLoggingInterceptor> interceptorProvider,
      Provider<AuthInterceptor> authInterceptorProvider) {
    return new AppModule_ProvideOkHttpClientFactory(interceptorProvider, authInterceptorProvider);
  }

  public static OkHttpClient provideOkHttpClient(HttpLoggingInterceptor interceptor,
      AuthInterceptor authInterceptor) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideOkHttpClient(interceptor, authInterceptor));
  }
}

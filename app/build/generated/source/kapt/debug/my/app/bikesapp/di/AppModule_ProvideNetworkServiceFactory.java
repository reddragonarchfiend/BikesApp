package my.app.bikesapp.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import my.app.bikesapp.networking.NetworkService;
import okhttp3.OkHttpClient;
import retrofit2.converter.gson.GsonConverterFactory;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class AppModule_ProvideNetworkServiceFactory implements Factory<NetworkService> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<GsonConverterFactory> converterFactoryProvider;

  private final Provider<Context> contextProvider;

  public AppModule_ProvideNetworkServiceFactory(Provider<OkHttpClient> okHttpClientProvider,
      Provider<GsonConverterFactory> converterFactoryProvider, Provider<Context> contextProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
    this.converterFactoryProvider = converterFactoryProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public NetworkService get() {
    return provideNetworkService(okHttpClientProvider.get(), converterFactoryProvider.get(), contextProvider.get());
  }

  public static AppModule_ProvideNetworkServiceFactory create(
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<GsonConverterFactory> converterFactoryProvider, Provider<Context> contextProvider) {
    return new AppModule_ProvideNetworkServiceFactory(okHttpClientProvider, converterFactoryProvider, contextProvider);
  }

  public static NetworkService provideNetworkService(OkHttpClient okHttpClient,
      GsonConverterFactory converterFactory, Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNetworkService(okHttpClient, converterFactory, context));
  }
}

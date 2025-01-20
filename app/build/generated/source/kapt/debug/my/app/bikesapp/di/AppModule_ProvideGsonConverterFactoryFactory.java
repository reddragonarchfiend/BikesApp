package my.app.bikesapp.di;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.converter.gson.GsonConverterFactory;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideGsonConverterFactoryFactory implements Factory<GsonConverterFactory> {
  private final Provider<Gson> gsonProvider;

  public AppModule_ProvideGsonConverterFactoryFactory(Provider<Gson> gsonProvider) {
    this.gsonProvider = gsonProvider;
  }

  @Override
  public GsonConverterFactory get() {
    return provideGsonConverterFactory(gsonProvider.get());
  }

  public static AppModule_ProvideGsonConverterFactoryFactory create(Provider<Gson> gsonProvider) {
    return new AppModule_ProvideGsonConverterFactoryFactory(gsonProvider);
  }

  public static GsonConverterFactory provideGsonConverterFactory(Gson gson) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideGsonConverterFactory(gson));
  }
}

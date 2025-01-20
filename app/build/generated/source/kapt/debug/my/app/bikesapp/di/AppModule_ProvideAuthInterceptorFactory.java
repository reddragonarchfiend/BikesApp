package my.app.bikesapp.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import my.app.bikesapp.networking.AuthInterceptor;

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
public final class AppModule_ProvideAuthInterceptorFactory implements Factory<AuthInterceptor> {
  @Override
  public AuthInterceptor get() {
    return provideAuthInterceptor();
  }

  public static AppModule_ProvideAuthInterceptorFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AuthInterceptor provideAuthInterceptor() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAuthInterceptor());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideAuthInterceptorFactory INSTANCE = new AppModule_ProvideAuthInterceptorFactory();
  }
}

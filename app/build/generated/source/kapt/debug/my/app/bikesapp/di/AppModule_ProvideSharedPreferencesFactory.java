package my.app.bikesapp.di;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.MasterKey;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class AppModule_ProvideSharedPreferencesFactory implements Factory<SharedPreferences> {
  private final Provider<Context> contextProvider;

  private final Provider<MasterKey> masterKeyProvider;

  public AppModule_ProvideSharedPreferencesFactory(Provider<Context> contextProvider,
      Provider<MasterKey> masterKeyProvider) {
    this.contextProvider = contextProvider;
    this.masterKeyProvider = masterKeyProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideSharedPreferences(contextProvider.get(), masterKeyProvider.get());
  }

  public static AppModule_ProvideSharedPreferencesFactory create(Provider<Context> contextProvider,
      Provider<MasterKey> masterKeyProvider) {
    return new AppModule_ProvideSharedPreferencesFactory(contextProvider, masterKeyProvider);
  }

  public static SharedPreferences provideSharedPreferences(Context context, MasterKey masterKey) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSharedPreferences(context, masterKey));
  }
}

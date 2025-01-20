package my.app.bikesapp.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import my.app.bikesapp.db.AppDatabase;
import my.app.bikesapp.db.CompanyCacheDao;

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
public final class AppModule_ProvideCompanyCacheDaoFactory implements Factory<CompanyCacheDao> {
  private final Provider<AppDatabase> appDatabaseProvider;

  public AppModule_ProvideCompanyCacheDaoFactory(Provider<AppDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public CompanyCacheDao get() {
    return provideCompanyCacheDao(appDatabaseProvider.get());
  }

  public static AppModule_ProvideCompanyCacheDaoFactory create(
      Provider<AppDatabase> appDatabaseProvider) {
    return new AppModule_ProvideCompanyCacheDaoFactory(appDatabaseProvider);
  }

  public static CompanyCacheDao provideCompanyCacheDao(AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideCompanyCacheDao(appDatabase));
  }
}

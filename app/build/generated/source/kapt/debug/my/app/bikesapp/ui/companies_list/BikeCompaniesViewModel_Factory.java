package my.app.bikesapp.ui.companies_list;

import android.content.SharedPreferences;
import androidx.lifecycle.SavedStateHandle;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import my.app.bikesapp.data.repositories.BikeCompaniesRepository;
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
public final class BikeCompaniesViewModel_Factory implements Factory<BikeCompaniesViewModel> {
  private final Provider<BikeCompaniesRepository> repositoryProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<CompanyCacheDao> companyCacheDaoProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public BikeCompaniesViewModel_Factory(Provider<BikeCompaniesRepository> repositoryProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<CompanyCacheDao> companyCacheDaoProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.repositoryProvider = repositoryProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.companyCacheDaoProvider = companyCacheDaoProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public BikeCompaniesViewModel get() {
    return newInstance(repositoryProvider.get(), sharedPreferencesProvider.get(), companyCacheDaoProvider.get(), savedStateHandleProvider.get());
  }

  public static BikeCompaniesViewModel_Factory create(
      Provider<BikeCompaniesRepository> repositoryProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<CompanyCacheDao> companyCacheDaoProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new BikeCompaniesViewModel_Factory(repositoryProvider, sharedPreferencesProvider, companyCacheDaoProvider, savedStateHandleProvider);
  }

  public static BikeCompaniesViewModel newInstance(BikeCompaniesRepository repository,
      SharedPreferences sharedPreferences, CompanyCacheDao companyCacheDao,
      SavedStateHandle savedStateHandle) {
    return new BikeCompaniesViewModel(repository, sharedPreferences, companyCacheDao, savedStateHandle);
  }
}

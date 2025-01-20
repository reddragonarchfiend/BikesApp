package my.app.bikesapp.ui.map;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import my.app.bikesapp.data.repositories.BikeCompaniesRepository;

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
public final class MapViewModel_Factory implements Factory<MapViewModel> {
  private final Provider<BikeCompaniesRepository> repositoryProvider;

  public MapViewModel_Factory(Provider<BikeCompaniesRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public MapViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static MapViewModel_Factory create(Provider<BikeCompaniesRepository> repositoryProvider) {
    return new MapViewModel_Factory(repositoryProvider);
  }

  public static MapViewModel newInstance(BikeCompaniesRepository repository) {
    return new MapViewModel(repository);
  }
}

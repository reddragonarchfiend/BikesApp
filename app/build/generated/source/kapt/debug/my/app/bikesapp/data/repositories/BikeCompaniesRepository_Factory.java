package my.app.bikesapp.data.repositories;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import my.app.bikesapp.networking.NetworkService;

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
public final class BikeCompaniesRepository_Factory implements Factory<BikeCompaniesRepository> {
  private final Provider<NetworkService> serviceProvider;

  public BikeCompaniesRepository_Factory(Provider<NetworkService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public BikeCompaniesRepository get() {
    return newInstance(serviceProvider.get());
  }

  public static BikeCompaniesRepository_Factory create(Provider<NetworkService> serviceProvider) {
    return new BikeCompaniesRepository_Factory(serviceProvider);
  }

  public static BikeCompaniesRepository newInstance(NetworkService service) {
    return new BikeCompaniesRepository(service);
  }
}

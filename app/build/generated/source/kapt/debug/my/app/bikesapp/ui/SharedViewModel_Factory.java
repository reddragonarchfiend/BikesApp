package my.app.bikesapp.ui;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class SharedViewModel_Factory implements Factory<SharedViewModel> {
  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public SharedViewModel_Factory(Provider<SavedStateHandle> savedStateHandleProvider) {
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public SharedViewModel get() {
    return newInstance(savedStateHandleProvider.get());
  }

  public static SharedViewModel_Factory create(
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new SharedViewModel_Factory(savedStateHandleProvider);
  }

  public static SharedViewModel newInstance(SavedStateHandle savedStateHandle) {
    return new SharedViewModel(savedStateHandle);
  }
}

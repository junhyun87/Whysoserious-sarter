// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.raywenderlich.android.whysoserious.presentation.implementation;

import com.raywenderlich.android.whysoserious.firebase.authentication.FirebaseAuthenticationInterface;
import com.raywenderlich.android.whysoserious.firebase.database.FirebaseDatabaseInterface;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class FavoriteJokesPresenterImpl_Factory
    implements Factory<FavoriteJokesPresenterImpl> {
  private final Provider<FirebaseAuthenticationInterface> authenticationInterfaceProvider;

  private final Provider<FirebaseDatabaseInterface> databaseInterfaceProvider;

  public FavoriteJokesPresenterImpl_Factory(
      Provider<FirebaseAuthenticationInterface> authenticationInterfaceProvider,
      Provider<FirebaseDatabaseInterface> databaseInterfaceProvider) {
    this.authenticationInterfaceProvider = authenticationInterfaceProvider;
    this.databaseInterfaceProvider = databaseInterfaceProvider;
  }

  @Override
  public FavoriteJokesPresenterImpl get() {
    return new FavoriteJokesPresenterImpl(
        authenticationInterfaceProvider.get(), databaseInterfaceProvider.get());
  }

  public static Factory<FavoriteJokesPresenterImpl> create(
      Provider<FirebaseAuthenticationInterface> authenticationInterfaceProvider,
      Provider<FirebaseDatabaseInterface> databaseInterfaceProvider) {
    return new FavoriteJokesPresenterImpl_Factory(
        authenticationInterfaceProvider, databaseInterfaceProvider);
  }
}
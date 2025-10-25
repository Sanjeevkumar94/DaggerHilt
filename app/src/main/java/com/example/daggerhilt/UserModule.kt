package com.example.daggerhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(FragmentComponent::class)
@Module
class UserModule {

    @Provides
    fun ProvidesUserRepositor(): UserRepository {
        return FirebaseRepository()
    }

}
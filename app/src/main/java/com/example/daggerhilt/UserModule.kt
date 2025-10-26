package com.example.daggerhilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


@InstallIn(FragmentComponent::class)
@Module
 class UserModule {

    @Provides
    @Named("firebase")
    fun providesFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }


    @Provides
    @Sql
    fun providesSqlRepository(sqlRepository: SQLRepository):UserRepository{
        return sqlRepository
    }



}
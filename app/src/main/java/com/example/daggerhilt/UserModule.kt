package com.example.daggerhilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(FragmentComponent::class)
@Module
abstract class UserModule {

  /*  @Provides
    fun ProvidesUserRepositor(): UserRepository {
        return FirebaseRepository()
    }
*/


    /*@Provides
    fun providesUserSqlRepository(sqlRepository: SQLRepository):UserRepository{
        return sqlRepository
    }*/


    @Binds
    abstract fun bindsUserRepo(sqlRepository: SQLRepository):UserRepository
}
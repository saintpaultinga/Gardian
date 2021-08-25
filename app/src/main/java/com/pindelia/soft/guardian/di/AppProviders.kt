package com.pindelia.soft.guardian.di

import com.pindelia.soft.guardian.ui.data.LoginDataSource
import com.pindelia.soft.guardian.ui.data.LoginRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppProviders {

    @Provides
    @Singleton
    fun provideLoginRepository(): LoginRepository = LoginRepository(LoginDataSource())
}
package ru.kiruxadance.feature_splash.presentation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.kiruxadance.feature_splash.presentation.navigation.SplashApi
import ru.kiruxadance.feature_splash.presentation.navigation.SplashApiImpl

@Module
@InstallIn(SingletonComponent::class)
object UIModule {

    @Provides
    fun provideSplashApi() : SplashApi {
        return SplashApiImpl()
    }
}
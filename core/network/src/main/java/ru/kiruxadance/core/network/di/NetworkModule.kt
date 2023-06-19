package ru.kiruxadance.core.network.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.kiruxadance.core.network.SoccerApiService
import ru.kiruxadance.core.network.data_providers.SoccerDataProviders

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    private const val BaseUrlSoccerApi = "https://api.soccersapi.com/"

    @Provides
    fun provideApiService(): SoccerApiService {
        return Retrofit.Builder().baseUrl(BaseUrlSoccerApi)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SoccerApiService::class.java)
    }

    @Provides
    fun provideSoccerDataProvider(apiService: SoccerApiService): SoccerDataProviders {
        return SoccerDataProviders(apiService)
    }
}
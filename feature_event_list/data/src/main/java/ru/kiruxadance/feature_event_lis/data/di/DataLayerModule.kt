package ru.kiruxadance.feature_event_lis.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.kiruxadance.core.network.data_providers.SoccerDataProviders
import ru.kiruxadance.feature_event_lis.data.repository.SoccerRepositoryImpl
import ru.kiruxadance.feature_event_list.domain.repository.SoccerRepository

@Module
@InstallIn(SingletonComponent::class)
object DataLayerModule {
    @Provides
    fun provideSoccerRepository(soccerDataProviders: SoccerDataProviders): SoccerRepository {
        return SoccerRepositoryImpl(soccerDataProviders)
    }
}
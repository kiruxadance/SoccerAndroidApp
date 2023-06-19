package ru.kiruxadance.feature_event_list.domain.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.kiruxadance.feature_event_list.domain.repository.SoccerRepository
import ru.kiruxadance.feature_event_list.domain.use_cases.GetFixtureUseCase

@Module
@InstallIn(SingletonComponent::class)
object DomainLayerModule {
    @Provides
    fun provideGetFixtureUseCase(soccerRepository: SoccerRepository): GetFixtureUseCase {
        return GetFixtureUseCase(soccerRepository)
    }
}
package ru.kiruxadance.feature_event_lis.data.repository

import ru.kiruxadance.core.network.SoccerApiService
import ru.kiruxadance.core.network.data_providers.SoccerDataProviders
import ru.kiruxadance.feature_event_lis.data.mapper.toDomainMatchesList
import ru.kiruxadance.feature_event_list.domain.model.Match
import ru.kiruxadance.feature_event_list.domain.repository.SoccerRepository
import javax.inject.Inject

class SoccerRepositoryImpl @Inject constructor(
    private val soccerDataProviders: SoccerDataProviders
) : SoccerRepository {
    override suspend fun getFixture(): List<Match> {
        return soccerDataProviders.getFixture().data.toDomainMatchesList()
    }
}
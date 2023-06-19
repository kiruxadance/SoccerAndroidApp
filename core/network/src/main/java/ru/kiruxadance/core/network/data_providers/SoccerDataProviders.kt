package ru.kiruxadance.core.network.data_providers

import ru.kiruxadance.core.network.SoccerApiService
import ru.kiruxadance.core.network.model.SoccerFixtureResponse
import javax.inject.Inject

class SoccerDataProviders @Inject constructor(
    private val apiService: SoccerApiService
) {
    suspend fun getFixture() = apiService.getFixture()
}
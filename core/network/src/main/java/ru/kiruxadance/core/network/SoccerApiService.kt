package ru.kiruxadance.core.network

import retrofit2.http.GET
import ru.kiruxadance.core.network.model.SoccerFixtureResponse

interface SoccerApiService {
    @GET("v2.2/fixtures/?user=brl199988&token=85e7e5888bf2a1699769623fe55fbd3c&t=schedule&d=2022-10-09&league_id=974")
    suspend fun getFixture(): SoccerFixtureResponse
}
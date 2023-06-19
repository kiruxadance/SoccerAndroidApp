package ru.kiruxadance.feature_event_list.domain.repository

import ru.kiruxadance.feature_event_list.domain.model.Match

interface SoccerRepository {
    suspend fun getFixture(): List<Match>
}
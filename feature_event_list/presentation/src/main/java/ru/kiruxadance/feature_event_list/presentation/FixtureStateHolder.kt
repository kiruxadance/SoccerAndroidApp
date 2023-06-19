package ru.kiruxadance.feature_event_list.presentation

import ru.kiruxadance.feature_event_list.domain.model.Match

data class FixtureStateHolder(
    val isLoading: Boolean = false,
    val data: List<Match>? = null,
    val error: String = ""
)

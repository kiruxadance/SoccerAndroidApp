package ru.kiruxadance.feature_event_list.domain.model

data class Match(
    val group_name: String,
    val id: Int,
    val league: League,
    val scores: Scores,
    val stage_name: String,
    val status: Int,
    val status_name: String,
    val teams: Teams,
    val time: Time
)

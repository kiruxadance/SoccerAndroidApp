package ru.kiruxadance.feature_event_list.domain.model

data class Team(
    val coach_id: String,
    val form: String,
    val id: Int,
    val img: String,
    val name: String,
    val short_code: String
)

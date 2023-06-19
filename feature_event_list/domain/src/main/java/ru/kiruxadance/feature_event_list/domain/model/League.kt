package ru.kiruxadance.feature_event_list.domain.model

data class League(
    val country_code: String,
    val country_flag: String,
    val country_id: String,
    val country_name: String,
    val id: Int,
    val name: String,
    val type: String
)

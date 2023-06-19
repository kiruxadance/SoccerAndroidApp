package ru.kiruxadance.core.network.model

data class LeagueDto(
    val country_code: String,
    val country_flag: String,
    val country_id: String,
    val country_name: String,
    val id: Int,
    val name: String,
    val type: String
)
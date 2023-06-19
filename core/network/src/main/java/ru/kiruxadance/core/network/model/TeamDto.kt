package ru.kiruxadance.core.network.model

data class TeamDto(
    val coach_id: String,
    val form: String,
    val id: Int,
    val img: String,
    val name: String,
    val short_code: String
)
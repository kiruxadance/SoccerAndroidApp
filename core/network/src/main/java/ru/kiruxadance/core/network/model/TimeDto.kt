package ru.kiruxadance.core.network.model

data class TimeDto(
    val date: String,
    val datetime: String,
    val minute: Int,
    val time: String,
    val timestamp: Int,
    val timezone: String
)
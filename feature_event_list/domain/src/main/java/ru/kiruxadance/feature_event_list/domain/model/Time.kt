package ru.kiruxadance.feature_event_list.domain.model

data class Time(
    val date: String,
    val datetime: String,
    val minute: Int,
    val time: String,
    val timestamp: Int,
    val timezone: String
)

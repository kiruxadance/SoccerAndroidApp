package ru.kiruxadance.core.network.model

data class MatchDto(
    val group_name: String,
    val id: Int,
    val league: LeagueDto,
    val scores: ScoresDto,
    val stage_name: String,
    val status: Int,
    val status_name: String,
    val teams: TeamsDto,
    val time: TimeDto
)
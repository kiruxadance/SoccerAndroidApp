package ru.kiruxadance.feature_event_lis.data.mapper

import ru.kiruxadance.core.network.model.*
import ru.kiruxadance.feature_event_list.domain.model.*

fun List<MatchDto>.toDomainMatchesList(): List<Match> {
    return this.map {
        Match(
            group_name = it.group_name,
            id = it.id,
            league = it.league.toDomainLeague(),
            scores = it.scores.toDomainScores(),
            stage_name = it.stage_name,
            status = it.status,
            status_name = it.status_name,
            teams = it.teams.toDomainTeams(),
            time = it.time.toDomainTime()
        )
    }
}

fun LeagueDto.toDomainLeague(): League {
    return League(
        country_code = this.country_code,
        country_flag = this.country_flag,
        country_id = this.country_id,
        country_name = this.country_name,
        id = this.id,
        name = this.name,
        type = this.type
    )
}

fun ScoresDto.toDomainScores(): Scores {
    return Scores(
        away_score = this.away_score,
        home_score = this.home_score,
    )
}

fun TeamsDto.toDomainTeams(): Teams {
    return Teams(
        away = this.away.toDomainTeam(),
        home = this.home.toDomainTeam()
    )
}

fun TeamDto.toDomainTeam(): Team {
    return Team(
        coach_id = this.coach_id,
        form = this.form,
        id = this.id,
        img = this.img,
        name = this.name,
        short_code = this.short_code
    )
}

fun TimeDto.toDomainTime(): Time {
    return Time(
        date = this.date,
        datetime = this.datetime,
        minute = this.minute,
        time = this.time,
        timestamp = this.timestamp,
        timezone = this.timezone
    )
}
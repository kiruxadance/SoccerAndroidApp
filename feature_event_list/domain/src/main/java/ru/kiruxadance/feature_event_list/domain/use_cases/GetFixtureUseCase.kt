package ru.kiruxadance.feature_event_list.domain.use_cases

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import ru.kiruxadance.core.common.Resource
import ru.kiruxadance.feature_event_list.domain.repository.SoccerRepository
import javax.inject.Inject

class GetFixtureUseCase @Inject constructor(
    private val soccerRepository: SoccerRepository
){
    suspend operator fun invoke() = flow {
        emit(Resource.Loading())
        emit(Resource.Success(soccerRepository.getFixture()))
    }.catch {
        emit(Resource.Error(it.message.toString()))
    }.flowOn(Dispatchers.IO)
}
package ru.kiruxadance.feature_event_list.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import ru.kiruxadance.core.common.Resource
import ru.kiruxadance.feature_event_list.domain.use_cases.GetFixtureUseCase
import javax.inject.Inject

@HiltViewModel
class EventsViewModel @Inject constructor(
    private val getFixtureUseCase: GetFixtureUseCase
) : ViewModel() {

    private val _matchList = mutableStateOf(FixtureStateHolder())
    val matchList: State<FixtureStateHolder> get() = _matchList

    init {
        viewModelScope.launch {
            getFixture()
        }
    }

    private fun getFixture() = viewModelScope.launch {
        getFixtureUseCase().onEach {
            when(it) {
                is Resource.Error -> {
                    _matchList.value = FixtureStateHolder(error = it.message.toString())
                }
                is Resource.Loading -> {
                    _matchList.value = FixtureStateHolder(isLoading = true)
                }
                is Resource.Success -> {
                    _matchList.value = FixtureStateHolder(data = it.data)
                }
            }
        }.launchIn(viewModelScope)
    }
}
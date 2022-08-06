package app.evolute.compose.feature.social.presentation.screen.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.evolute.compose.common.Resource
import app.evolute.compose.common.constants.ExceptionMessage
import app.evolute.compose.common.getEmpty
import app.evolute.compose.feature.social.domain.model.PostModel
import app.evolute.compose.feature.social.domain.model.SocialModel
import app.evolute.compose.feature.social.domain.use_case.GetPostListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val getPostListUseCase: GetPostListUseCase) : ViewModel() {
    //region Companion
    companion object {
        private const val PAGINATION_LIMIT: Int = 30
    }
    //endregion

    //region Variables
    private val _socialModel: MutableLiveData<SocialModel> = MutableLiveData()
    private val _homeState = mutableStateOf(HomeState())
    val homeState: State<HomeState> = _homeState
    //endregion

    //region Initialization
    init {
        viewModelScope.launch {
            getPostList()
        }
    }
    //endregion

    //region Public Methods
    fun getPostList() {
        val hasMore: Boolean = _socialModel.value?.hasMore ?: true
        val state = _homeState.value

        if (!state.isLoading && hasMore) {
            state.apply {
                currentPage += 1
            }
            _homeState.value = state

            getPostListFor(state.currentPage)
        }
    }
    //endregion

    //region Private Methods
    private fun getPostListFor(page: Int?) {
        page ?: return

        viewModelScope.launch {
            getPostListUseCase(page, PAGINATION_LIMIT).onEach { result ->
                when (result) {
                    is Resource.Success -> {
                        _socialModel.value = result.data ?: SocialModel()
                        updateHomeState(_socialModel.value)
                    }
                    is Resource.Error -> {
                        val state = _homeState.value
                        state.apply {
                            isLoading = false
                            error = result.message ?: ExceptionMessage.UNEXPECTED_ERROR
                        }
                        _homeState.value = state
                    }
                    is Resource.Loading -> {
                        val state = _homeState.value
                        state.apply {
                            isLoading = true
                        }
                        _homeState.value = state
                    }
                }
            }
        }
    }

    private fun updateHomeState(socialModel: SocialModel?) {
        socialModel ?: return
        val receivedPostList: List<PostModel> = socialModel.docs ?: return
        val state = _homeState.value

        state.apply {
            isLoading = false
            error = String.Companion.getEmpty()
            val currentPostList = postList.toMutableList()
            val filteredPostList = getFilteredPostList(receivedPostList)
            currentPostList.addAll(filteredPostList)
            postList = currentPostList
        }

        _homeState.value = state
    }

    private fun getFilteredPostList(postList: List<PostModel>?): List<PostModel> {
        postList ?: return listOf()

        return postList.filter { item -> item.mediaList!!.all { it.mediaType == app.evolute.compose.feature.social.data.enum.MediaType.IMAGE.id } }
    }
    //endregion
}
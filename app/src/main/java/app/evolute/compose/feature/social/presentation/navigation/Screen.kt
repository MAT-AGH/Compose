package app.evolute.compose.feature.social.presentation.navigation

sealed class Screen(val route: String) {
    //region Companion
    companion object {
        private const val HOME_SCREEN_ROUTE = "home_screen_route"
    }
    //endregion Companion

    //region Screen
    object HomeScreen : Screen(HOME_SCREEN_ROUTE)
    //endregion Screen
}

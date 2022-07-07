package edu.xfolex.picteed.navigation

sealed class Screen(val route: String) {
    object Home: Screen("home_screen")
}

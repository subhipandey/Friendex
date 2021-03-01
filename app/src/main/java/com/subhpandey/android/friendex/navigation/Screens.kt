package com.subhpandey.android.friendex.navigation

sealed class Screens (val route: String){
    object Home: Screens(route = "home")
    object Details: Screens(route = "details")
}
package com.subhpandey.android.friendex.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.*
import com.subhpandey.android.friendex.ui.screens.DetailsScreen
import com.subhpandey.android.friendex.ui.screens.HomeScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.Home.route) {


        composable(route = Screens.Home.route) {
            HomeScreen(
                onFriendClick = { friend ->
                    navController.navigate("${Screens.Details.route}/$friend")
                }
            )
        }

        composable(
            route = "${Screens.Details.route}/{friendArg}",
            arguments = listOf(navArgument("friendArg") { type = NavType.IntType })
        ) { navBackStackEntry ->
            navBackStackEntry.arguments?.getInt("friendArg")?.let { friendId ->
                DetailsScreen(
                    friendId = friendId,
                    onNavigationBack = { navController.popBackStack() }
                )
            }
        }
    }
}



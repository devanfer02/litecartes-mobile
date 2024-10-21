package com.example.litecartesnative.components

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.litecartesnative.features.auth.presentation.screens.AuthLoginScreen
import com.example.litecartesnative.features.auth.presentation.screens.AuthRegisterScreen
import com.example.litecartesnative.features.auth.presentation.screens.AuthStartScreen
import com.example.litecartesnative.features.user.presentations.screens.LeaderboardScreen
import com.example.litecartesnative.features.quiz.presentation.screens.HomeScreen
import com.example.litecartesnative.features.quiz.presentation.screens.LevelScreen
import com.example.litecartesnative.features.quiz.presentation.screens.QuestionScreen
import com.example.litecartesnative.features.user.presentations.screens.FriendScreen
import com.example.litecartesnative.features.user.presentations.screens.ProfileScreen
import com.example.litecartesnative.ui.constants.Screen
import com.example.litecartesnative.ui.constants.questionDummy

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.AuthStartScreen.route
    ) {
        composable(
            route = Screen.AuthStartScreen.route
        ) {
            AuthStartScreen(
                navController = navController
            )
        }
        composable(
            route = Screen.AuthLoginScreen.route
        ) {
            AuthLoginScreen(
                navController = navController
            )
        }
        composable(
            route = Screen.AuthRegisterScreen.route
        ) {
            AuthRegisterScreen(
                navController = navController
            )
        }
        composable(
            route = Screen.HomeScreen.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.LevelScreen.route
        ) {
            LevelScreen(navController = navController)
        }
        composable(
            route = Screen.QuestionScreen.route
        ) {
            QuestionScreen(question = questionDummy)
        }
        composable(
            route = Screen.LeaderboardScreen.route
        ) {
            LeaderboardScreen(navController = navController)
        }
        composable(
            route = Screen.ProfileScreen.route
        ) {
            ProfileScreen(navController = navController)
        }
        composable(
            route = Screen.FriendScreen.route
        ) {
            FriendScreen(navController = navController)
        }
    }
}
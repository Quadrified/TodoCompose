package com.quadrified.todocompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.quadrified.todocompose.navigation.destinations.listComposable
import com.quadrified.todocompose.navigation.destinations.taskComposable
import com.quadrified.todocompose.utils.Constants

// NavHost
@Composable
fun SetupNavigation(navController: NavHostController) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = Constants.LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task
        )
        taskComposable(
            navigateToListScreen = screen.list
        )
    }
}
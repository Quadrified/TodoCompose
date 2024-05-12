package com.quadrified.todocompose.navigation

import androidx.navigation.NavHostController
import com.quadrified.todocompose.utils.Action
import com.quadrified.todocompose.utils.Constants

// NavController
class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(Constants.LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }
}
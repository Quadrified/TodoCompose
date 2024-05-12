package com.quadrified.todocompose.utils

object Constants {
    // const => compile-time constants
    const val DATABASE_TABLE = "todo_table"
    const val DATABASE_NAME = "todo_database"

    // Navigation
    const val LIST_SCREEN = "list/{action}"
    const val TASK_SCREEN = "task/{taskId}"

    const val LIST_ARGUMENT_KEY = "action"
    const val TASK_ARGUMENT_KEY = "task"
}
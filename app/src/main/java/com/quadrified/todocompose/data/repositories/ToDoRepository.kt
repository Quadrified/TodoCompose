package com.quadrified.todocompose.data.repositories

import com.quadrified.todocompose.data.ToDoDao
import com.quadrified.todocompose.data.models.ToDoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

// Implements all functions from ToDoDao interface
@ViewModelScoped
class ToDoRepository @Inject constructor(private val toDoDao: ToDoDao) {
    val getAllTasks: Flow<List<ToDoTask>> = toDoDao.getAllTasks()

    val sortByLowPriority: Flow<List<ToDoTask>> = toDoDao.sortByLowPriority()

    val sortByHighPriority: Flow<List<ToDoTask>> = toDoDao.sortByHighPriority()

    // no suspend because Flow is async
    fun getSelectedTask(taskId: Int): Flow<ToDoTask> {
        return toDoDao.getSelectedTask(taskId = taskId)
    }

    suspend fun addTask(toDoDTask: ToDoTask) {
        toDoDao.addTask(toDoTask = toDoDTask)
    }

    suspend fun updateTask(toDoDTask: ToDoTask) {
        toDoDao.updateTask(toDoTask = toDoDTask)
    }

    suspend fun deleteTask(toDoDTask: ToDoTask) {
        toDoDao.deleteTask(toDoTask = toDoDTask)
    }

    suspend fun deleteAllTasks() {
        toDoDao.deleteAllTasks()
    }

    fun searchDatabase(searchQuery: String): Flow<List<ToDoTask>> {
        return toDoDao.searchDatabase(searchQuery = searchQuery)
    }

}
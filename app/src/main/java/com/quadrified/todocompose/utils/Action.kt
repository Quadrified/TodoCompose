package com.quadrified.todocompose.utils

// pass actions from TaskComposable to ListComposable
enum class Action {
    ADD,
    UPDATE,
    DELETE,
    DELETE_ALL,
    UNDO,
    NO_ACTION
}
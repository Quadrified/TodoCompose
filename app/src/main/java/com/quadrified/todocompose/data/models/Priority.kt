package com.quadrified.todocompose.data.models

import androidx.compose.ui.graphics.Color
import com.quadrified.todocompose.ui.theme.HighPriorityColor
import com.quadrified.todocompose.ui.theme.LowPriorityColor
import com.quadrified.todocompose.ui.theme.MediumPriorityColor
import com.quadrified.todocompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor),
}
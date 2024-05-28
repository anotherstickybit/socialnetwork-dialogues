package ru.puppeteers.socialnetworkdialogues.entity

import java.time.LocalDateTime
import java.util.*

data class DialogueEntity(
    val id: UUID,
    val creationDate: LocalDateTime
)
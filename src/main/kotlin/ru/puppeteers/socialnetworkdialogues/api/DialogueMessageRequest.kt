package ru.puppeteers.socialnetworkdialogues.api

import java.util.*

data class DialogueMessageRequest(
    val dialogueId: UUID,
    val authorId: UUID,
    val messageText: String
)
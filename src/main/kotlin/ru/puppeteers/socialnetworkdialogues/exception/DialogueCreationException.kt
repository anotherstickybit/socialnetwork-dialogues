package ru.puppeteers.socialnetworkdialogues.exception

import lombok.experimental.StandardException

@StandardException
class DialogueCreationException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
package ru.puppeteers.socialnetworkdialogues.exception

import lombok.experimental.StandardException

@StandardException
class DialogueMessageCreationException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
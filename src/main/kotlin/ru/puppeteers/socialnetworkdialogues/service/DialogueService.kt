package ru.puppeteers.socialnetworkdialogues.service

import org.springframework.stereotype.Service
import ru.puppeteers.socialnetworkdialogues.api.DialogueMessageRequest
import ru.puppeteers.socialnetworkdialogues.api.DialogueRequest
import ru.puppeteers.socialnetworkdialogues.api.DialogueResponse
import ru.puppeteers.socialnetworkdialogues.api.ReadDialogueMessagesRequest
import ru.puppeteers.socialnetworkdialogues.dao.DialogueDao
import ru.puppeteers.socialnetworkdialogues.entity.DialogueMessageEntity

@Service
class DialogueService(
    val dialogueDao: DialogueDao
) {

    fun createDialog(dialogueRequest: DialogueRequest): DialogueResponse {
        val uuid = dialogueDao.create(dialogueRequest.creatorId)
        return DialogueResponse(uuid!!)
    }

    fun createMessage(dialogueMessageRequest: DialogueMessageRequest) {
        dialogueDao.createMessage(dialogueMessageRequest.dialogueId, dialogueMessageRequest.authorId,
            dialogueMessageRequest.messageText)
    }

    fun getDialogueMessages(readDialogueMessagesRequest: ReadDialogueMessagesRequest): List<DialogueMessageEntity> {
        return dialogueDao.getDialogueMessages(readDialogueMessagesRequest.dialogueId)
    }
}
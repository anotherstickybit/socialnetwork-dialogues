package ru.puppeteers.socialnetworkdialogues.endpoint

import jakarta.ws.rs.Consumes
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import org.springframework.stereotype.Controller
import ru.puppeteers.socialnetworkdialogues.api.DialogueMessageRequest
import ru.puppeteers.socialnetworkdialogues.api.DialogueRequest
import ru.puppeteers.socialnetworkdialogues.api.DialogueResponse
import ru.puppeteers.socialnetworkdialogues.api.ReadDialogueMessagesRequest
import ru.puppeteers.socialnetworkdialogues.entity.DialogueMessageEntity
import ru.puppeteers.socialnetworkdialogues.service.DialogueService

@Controller
@Path("/dialogue")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class DialogueEndpoint(
    val dialogueService: DialogueService
) {

    @POST
    @Path("/new")
    fun createDialogue(dialogueRequest: DialogueRequest): DialogueResponse {
        return dialogueService.createDialog(dialogueRequest)
    }

    @POST
    @Path("/newMessage")
    fun createNewDialogueMessage(dialogueMessageRequest: DialogueMessageRequest) {
        dialogueService.createMessage(dialogueMessageRequest)
    }

    @POST
    @Path("/read")
    fun readDialogueMessages(readDialogueMessagesRequest: ReadDialogueMessagesRequest): List<DialogueMessageEntity> {
        return dialogueService.getDialogueMessages(readDialogueMessagesRequest)
    }
}
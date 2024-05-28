package ru.puppeteers.socialnetworkdialogues.config

import org.glassfish.jersey.server.ResourceConfig
import org.springframework.context.annotation.Configuration
import ru.puppeteers.socialnetworkdialogues.endpoint.DialogueEndpoint

@Configuration
class JerseyConfig : ResourceConfig() {
    init {
        register(DialogueEndpoint::class.java)
    }
}
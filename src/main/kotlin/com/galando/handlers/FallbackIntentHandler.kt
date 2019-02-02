package com.galando.handlers

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates.intentName
import java.util.*


class FallbackIntentHandler : RequestHandler {
    override fun canHandle(input: HandlerInput?): Boolean {
        return input!!.matches(intentName("AMAZON.FallbackIntent"))
    }

    override fun handle(input: HandlerInput?): Optional<Response> {
        val speechText = "Sorry, I don't know that. You can say try saying help!"

        return input!!.responseBuilder
                .withSpeech(speechText)
                .withSimpleCard("HelloWorld", speechText)
                .withReprompt(speechText)
                .build()
    }
}

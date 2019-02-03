package com.galando

import com.amazon.ask.Skill
import com.amazon.ask.SkillStreamHandler
import com.amazon.ask.Skills
import com.galando.handlers.*

val skill: Skill =
            Skills.standard()
                    .addRequestHandlers(
                            CancelandStopIntentHandler(),
                            HelloWorldIntentHandler(),
                            HelpIntentHandler(),
                            LaunchRequestHandler(),
                            SessionEndedRequestHandler())
                    .build()

class HelloWorldStreamHandler: SkillStreamHandler(skill)
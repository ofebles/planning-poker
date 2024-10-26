package com.ofebles.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.jte.JteContent
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/index") {
            val params = mapOf("id" to 1, "name" to "John")
            call.respond(JteContent("index.kte", params))
        }

    }
}

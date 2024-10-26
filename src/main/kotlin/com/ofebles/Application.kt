package com.ofebles

import com.ofebles.plugins.*
import gg.jte.ContentType
import gg.jte.TemplateEngine
import gg.jte.resolve.DirectoryCodeResolver
import io.ktor.server.application.*
import io.ktor.server.jte.*
import java.nio.file.Path

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    install(Jte) {
        val resolver = DirectoryCodeResolver(Path.of("src/main/resources/templates"))
        templateEngine = TemplateEngine.create(resolver, ContentType.Html)
    }
    configureRouting()
}

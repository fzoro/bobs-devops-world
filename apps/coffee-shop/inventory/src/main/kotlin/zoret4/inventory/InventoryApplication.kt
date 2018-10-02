package zoret4.inventory

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Bean


@SpringBootApplication
class InventoryApplication

fun main(args: Array<String>) {
    runApplication<InventoryApplication>(*args)
}
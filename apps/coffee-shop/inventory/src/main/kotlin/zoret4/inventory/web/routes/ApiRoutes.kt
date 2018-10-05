package zoret4.inventory.web.routes

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.router
import zoret4.inventory.web.handlers.CoffeeHandler


@Configuration
class ApiRoutes(val coffeHandler: CoffeeHandler) {

    @Bean
    fun routes() = router {
        (accept(MediaType.APPLICATION_JSON) and "/inventory").nest {
            "/coffee".nest {
                GET("/", coffeHandler::get)
            }
        }

    }
}
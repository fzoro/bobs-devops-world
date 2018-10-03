package zoret4.inventory.web.routes

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.router


@Configuration
class ApiRoutes {

    @Bean
    fun routes() = router {
        (accept(MediaType.APPLICATION_JSON) and "/inventory").nest {
            "/coffee".nest {
                GET("/", { req ->
                    ok().build()
                })
            }
        }

    }
}
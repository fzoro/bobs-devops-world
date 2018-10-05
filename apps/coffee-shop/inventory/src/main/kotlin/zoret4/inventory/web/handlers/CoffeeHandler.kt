package zoret4.inventory.web.handlers

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.body
import reactor.core.publisher.Mono
import zoret4.inventory.AppProperties

@Component
class CoffeeHandler(val appProperties: AppProperties) {
    fun get(req: ServerRequest) = ok()
            .body(Mono.just("hi from kotlin micro service - ${appProperties.upstream.clientKey}"))

}
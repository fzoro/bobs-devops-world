package zoret4.inventory

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("app")
class AppProperties {
    val upstream = Upstream()

    class Upstream {
        lateinit var clientKey: String
        val microservices = Microservices()

        class Microservices {
            val foundation = MicroserviceProperties()
            val socialmedia = MicroserviceProperties()

            class MicroserviceProperties {
                lateinit var uri: String
            }

        }
    }
}
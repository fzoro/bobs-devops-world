package zoret4.inventory

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication


@SpringBootApplication
@EnableConfigurationProperties(AppProperties::class)
class InventoryApplication

fun main(args: Array<String>) {
    runApplication<InventoryApplication>(*args)
}
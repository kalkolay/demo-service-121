package com.itmo.microservices.demo.warehouse.api.config

import WarehouseAggregate
import com.itmo.microservices.demo.warehouse.Warehouse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ru.quipy.core.EventSourcingService
import ru.quipy.core.EventSourcingServiceFactory
import java.util.*

@Configuration
class WarehouseConfig {

    @Autowired
    private lateinit var eventSourcingServiceFactory: EventSourcingServiceFactory

    @Bean
    fun warehouseEventSourcingService(): EventSourcingService<UUID, WarehouseAggregate, Warehouse> =
        eventSourcingServiceFactory.create()
}
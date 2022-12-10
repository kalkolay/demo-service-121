package com.itmo.microservices.demo.warehouse.projections

import WarehouseAggregate
import com.itmo.microservices.demo.warehouse.api.model.ItemAddedToWarehouseEvent
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.quipy.streams.AggregateSubscriptionsManager
import javax.annotation.PostConstruct

@Service
class WarehouseEventsSubscriber {

    val logger: Logger = LoggerFactory.getLogger(WarehouseEventsSubscriber::class.java)

    @Autowired
    lateinit var subscriptionsManager: AggregateSubscriptionsManager

    @PostConstruct
    fun init() {
        subscriptionsManager.createSubscriber(WarehouseAggregate::class, "any-meaningful-name") {

            `when`(ItemAddedToWarehouseEvent::class) { event ->
                logger.info("Item Added: {}", event.warehouseItemId)
            }
        }
    }
}
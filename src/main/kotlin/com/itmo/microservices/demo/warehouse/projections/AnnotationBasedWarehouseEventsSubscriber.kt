package com.itmo.microservices.demo.warehouse.projections

import WarehouseAggregate
import com.itmo.microservices.demo.warehouse.api.model.ItemAddedToWarehouseEvent
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import ru.quipy.streams.annotation.AggregateSubscriber
import ru.quipy.streams.annotation.SubscribeEvent

@Service
@AggregateSubscriber(
    aggregateClass = WarehouseAggregate::class, subscriberName = "demo-subs-stream"
)
class AnnotationBasedWarehouseEventsSubscriber {

    val logger: Logger = LoggerFactory.getLogger(AnnotationBasedWarehouseEventsSubscriber::class.java)


    @SubscribeEvent
    fun taskCreatedSubscriber(event: ItemAddedToWarehouseEvent) {
        logger.info("Item Added: {}", event.warehouseItemId)
    }
}
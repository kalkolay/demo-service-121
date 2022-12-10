package com.itmo.microservices.demo.warehouse.api.model

import WarehouseAggregate

import ru.quipy.core.annotations.DomainEvent
import ru.quipy.domain.Event
import java.util.*

const val ITEM_ADDED_TO_WAREHOUSE_EVENT: String = "ITEM_ADDED_TO_WAREHOUSE_EVENT"

@DomainEvent(name = ITEM_ADDED_TO_WAREHOUSE_EVENT)
class ItemAddedToWarehouseEvent(
    val warehouseItemId: UUID,
    val title: String,
    var description: String,
    val price: Int,
    val amount: Int,
    createdAt: Long = System.currentTimeMillis(),
) : Event<WarehouseAggregate>(
    name = ITEM_ADDED_TO_WAREHOUSE_EVENT,
    createdAt = createdAt
)
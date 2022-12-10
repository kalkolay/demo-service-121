package com.itmo.microservices.demo.warehouse.logic

import com.itmo.microservices.demo.warehouse.api.model.ItemAddedToWarehouseEvent
import java.util.*

fun WarehouseAggregateState.addItem(warehouseItemId: UUID,
                                    title: String,
                                    description: String,
                                    price: Int,
                                    amount: Int): ItemAddedToWarehouseEvent {

    return ItemAddedToWarehouseEvent(
        warehouseItemId,
        title,
        description,
        price,
        amount
    )
}
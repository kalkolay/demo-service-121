package com.itmo.microservices.demo.warehouse

import WarehouseAggregate
import ru.quipy.domain.AggregateState
import java.util.*

class Warehouse : AggregateState<UUID, WarehouseAggregate> {
    fun allItems() {
        TODO("Not yet implemented")
    }

    override fun getId(): UUID? {
        TODO("Not yet implemented")
    }
}
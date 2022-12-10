package com.itmo.microservices.demo.warehouse.logic

import WarehouseAggregate
import com.itmo.microservices.demo.warehouse.api.model.WarehouseItemModel
import ru.quipy.domain.AggregateState
import java.util.*

class WarehouseAggregateState : AggregateState<UUID, WarehouseAggregate> {
    private lateinit var warehouseId: UUID
    private lateinit var items: List<WarehouseItemModel>

    fun allItems(available: Boolean, size: Int): List<WarehouseItemModel> {
        return this.items
    }

    override fun getId(): UUID {
        return this.warehouseId
    }
}
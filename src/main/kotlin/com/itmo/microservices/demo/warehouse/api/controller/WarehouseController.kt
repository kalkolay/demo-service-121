package com.itmo.microservices.demo.warehouse.api.controller

import WarehouseAggregate
import com.itmo.microservices.demo.warehouse.Warehouse
import com.itmo.microservices.demo.warehouse.api.model.WarehouseItemModel
import org.springframework.web.bind.annotation.*
import ru.quipy.core.EventSourcingService
import java.util.*

@RestController
@RequestMapping("/warehouse")
class WarehouseController( val warehouseEventSourcingService: EventSourcingService<UUID, WarehouseAggregate, Warehouse>) {


    @GetMapping("/items?available={available}&size={size}")
    fun allItems(): List<WarehouseItemModel> = TODO("Not yet implemented")
}
package com.itmo.microservices.demo.warehouse.api.service

import com.itmo.microservices.demo.warehouse.api.model.WarehouseItemModel
import org.springframework.web.bind.annotation.RequestParam

interface WarehouseService {
    fun allItems(available: Boolean, size: Int): List<WarehouseItemModel>
}
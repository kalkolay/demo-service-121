package com.itmo.microservices.demo.warehouse.api.service

import com.itmo.microservices.demo.warehouse.api.model.WarehouseItemModel

interface WarehouseService {
    fun allItems(): List<WarehouseItemModel>
}
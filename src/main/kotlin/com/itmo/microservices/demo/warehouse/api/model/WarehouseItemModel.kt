package com.itmo.microservices.demo.warehouse.api.model;

import com.fasterxml.jackson.annotation.JsonInclude
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
data class WarehouseItemModel(
    val id: UUID?,
)
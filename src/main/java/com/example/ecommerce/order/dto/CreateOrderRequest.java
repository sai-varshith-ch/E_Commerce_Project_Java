package com.example.ecommerce.order.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;

@Data
public class CreateOrderRequest {

    @Valid
    @NotEmpty(message = "At least one item is required")
    private List<OrderItemRequest> items;
}
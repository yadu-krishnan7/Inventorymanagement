package com.inventory.inventoryManagement.dtos;

import java.util.List;

public record ProductDiscountInfo(String productId, double ogPrice, double finalPrice
        , List<AppliedDiscount> appliedDiscounts, double totalSavings ) {
}

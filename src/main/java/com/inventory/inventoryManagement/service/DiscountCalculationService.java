package com.inventory.inventoryManagement.service;

import com.inventory.inventoryManagement.dtos.ProductDiscountInfo;
import com.inventory.inventoryManagement.dtos.ProductInfo;

public interface DiscountCalculationService {

   ProductDiscountInfo calculateDiscount(ProductInfo productInfo);
}

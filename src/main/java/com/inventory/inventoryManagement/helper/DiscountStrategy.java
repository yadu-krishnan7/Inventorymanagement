package com.inventory.inventoryManagement.helper;

import com.inventory.inventoryManagement.dtos.ProductDiscountInfo;
import com.inventory.inventoryManagement.entities.Product;
import com.inventory.inventoryManagement.entities.PromoCode;
import com.inventory.inventoryManagement.entities.UserType;

public interface DiscountStrategy {
    ProductDiscountInfo applyDiscount(Product product, PromoCode promoCode, UserType userType);
}

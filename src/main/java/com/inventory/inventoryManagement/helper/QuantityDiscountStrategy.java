package com.inventory.inventoryManagement.helper;

import com.inventory.inventoryManagement.dtos.AppliedDiscount;
import com.inventory.inventoryManagement.dtos.ProductDiscountInfo;
import com.inventory.inventoryManagement.entities.Product;
import com.inventory.inventoryManagement.entities.PromoCode;
import com.inventory.inventoryManagement.entities.UserType;

import java.util.List;

public class QuantityDiscountStrategy implements DiscountStrategy{
    @Override
    public ProductDiscountInfo applyDiscount(Product product, PromoCode promoCode, UserType userType) {
        double finalPrice = product.getBasePrice() * product.getAvailableQuantity();
        List<AppliedDiscount> appliedDiscounts = List.of(new AppliedDiscount(promoCode.getCode(),promoCode.getDiscountPercentage()),
                new AppliedDiscount(userType.getType(),userType.getDiscountPercentage()
                ));

        double totalSavings = product.getBasePrice() - finalPrice;

        ProductDiscountInfo discountInfo = new ProductDiscountInfo(product.getId(),
                product.getBasePrice(),
                finalPrice,
                appliedDiscounts,
                totalSavings
        );


        return discountInfo;
    }
}

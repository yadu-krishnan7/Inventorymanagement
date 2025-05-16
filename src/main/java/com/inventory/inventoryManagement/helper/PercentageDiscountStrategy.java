package com.inventory.inventoryManagement.helper;

import com.inventory.inventoryManagement.dtos.AppliedDiscount;
import com.inventory.inventoryManagement.dtos.ProductDiscountInfo;
import com.inventory.inventoryManagement.entities.Product;
import com.inventory.inventoryManagement.entities.PromoCode;
import com.inventory.inventoryManagement.entities.UserType;

import java.util.List;

public class PercentageDiscountStrategy implements DiscountStrategy{
    @Override
    public ProductDiscountInfo applyDiscount(Product product, PromoCode promoCode, UserType userType) {
        double discountPromoCode = ( promoCode.getDiscountPercentage() / 100 ) * product.getBasePrice();
        double discountUserType = ( userType.getDiscountPercentage() / 100 ) * product.getBasePrice();

        double maxDiscount = Math.max(discountPromoCode,discountUserType);
        double finalPrice = product.getBasePrice() - maxDiscount;

        double finalRoundedPrice = Math.round(finalPrice);

        List<AppliedDiscount> appliedDiscounts = List.of(new AppliedDiscount(promoCode.getCode(),promoCode.getDiscountPercentage()),
                new AppliedDiscount(userType.getType(),userType.getDiscountPercentage()
                ));

        double totalSavings = product.getBasePrice() - finalPrice;

        ProductDiscountInfo discountInfo = new ProductDiscountInfo(product.getId(),
                product.getBasePrice(),
                finalRoundedPrice,
                appliedDiscounts,
                totalSavings
        );


        return discountInfo;
    }
}

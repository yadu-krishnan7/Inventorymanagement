package com.inventory.inventoryManagement.service.impl;

import com.inventory.inventoryManagement.dtos.AppliedDiscount;
import com.inventory.inventoryManagement.dtos.ProductDiscountInfo;
import com.inventory.inventoryManagement.dtos.ProductInfo;
import com.inventory.inventoryManagement.entities.Product;
import com.inventory.inventoryManagement.entities.PromoCode;
import com.inventory.inventoryManagement.entities.UserType;
import com.inventory.inventoryManagement.service.DiscountCalculationService;
import com.inventory.inventoryManagement.service.ProductService;
import com.inventory.inventoryManagement.service.PromoCodeService;
import com.inventory.inventoryManagement.service.UserTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class DiscountCalculationServiceImpl implements DiscountCalculationService {

    private final ProductService productService;

    private final PromoCodeService promoCodeService;

    private final UserTypeService userTypeService;

    public DiscountCalculationServiceImpl(ProductService productService, PromoCodeService promoCodeService, UserTypeService userTypeService) {
        this.productService = productService;
        this.promoCodeService = promoCodeService;
        this.userTypeService = userTypeService;
    }


    @Override
    public ProductDiscountInfo calculateDiscount(ProductInfo productInfo) {

        Product product = productService.findByProductId(productInfo.productId());
        PromoCode promoCode = promoCodeService.findByCode(productInfo.promoCode());
        UserType userType = userTypeService.findByUserType(productInfo.userType());

        double discountPromoCode = ( promoCode.getDiscountPercentage() / 100 ) * product.getBasePrice();
        double discountUserType = ( userType.getDiscountPercentage() / 100 ) * product.getBasePrice();

        double finalPrice = product.getBasePrice() - (discountPromoCode + discountUserType);

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

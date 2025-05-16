package com.inventory.inventoryManagement.service.impl;

import com.inventory.inventoryManagement.dtos.ProductDiscountInfo;
import com.inventory.inventoryManagement.dtos.ProductInfo;
import com.inventory.inventoryManagement.entities.Product;
import com.inventory.inventoryManagement.entities.PromoCode;
import com.inventory.inventoryManagement.entities.UserType;
import com.inventory.inventoryManagement.helper.DiscountCalculatorHelper;
import com.inventory.inventoryManagement.helper.DiscountStrategy;
import com.inventory.inventoryManagement.service.DiscountCalculationService;
import com.inventory.inventoryManagement.service.ProductService;
import com.inventory.inventoryManagement.service.PromoCodeService;
import com.inventory.inventoryManagement.service.UserTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


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
    public ProductDiscountInfo calculateDiscount(ProductInfo productInfo,String type) {

        Product product = productService.findByProductId(productInfo.productId());
        PromoCode promoCode = promoCodeService.findByCode(productInfo.promoCode());
        UserType userType = userTypeService.findByUserType(productInfo.userType());

        DiscountStrategy discountStrategy = DiscountCalculatorHelper.getDiscountStrategy(type);

        return discountStrategy.applyDiscount(product,promoCode,userType);
    }
}

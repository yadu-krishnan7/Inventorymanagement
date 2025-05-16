package com.inventory.inventoryManagement.restController;


import com.inventory.inventoryManagement.dtos.ProductDiscountInfo;
import com.inventory.inventoryManagement.dtos.ProductInfo;
import com.inventory.inventoryManagement.service.DiscountCalculationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class DiscountInfoController {

    private final DiscountCalculationService discountCalculationService;

    public DiscountInfoController(DiscountCalculationService discountCalculationService) {
        this.discountCalculationService = discountCalculationService;
    }

    @PostMapping("/price-calculation/{type}")
    public ResponseEntity<ProductDiscountInfo> calculateDiscount(@RequestBody ProductInfo productInfo, @PathVariable String type){
        return ResponseEntity.ok(discountCalculationService.calculateDiscount(productInfo,type));
    }
}

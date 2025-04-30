package com.inventory.inventoryManagement.service;

import com.inventory.inventoryManagement.entities.PromoCode;

public interface PromoCodeService {

    PromoCode findByCode(String code);
}

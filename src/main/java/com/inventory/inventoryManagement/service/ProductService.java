package com.inventory.inventoryManagement.service;

import com.inventory.inventoryManagement.entities.Product;

public interface ProductService {

    Product findByProductId(String id);
}

package com.inventory.inventoryManagement.service.impl;

import com.inventory.inventoryManagement.entities.Product;
import com.inventory.inventoryManagement.exceptions.ProductNotFoundException;
import com.inventory.inventoryManagement.repo.ProductRepository;
import com.inventory.inventoryManagement.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product findByProductId(String id) {
        Optional<Product> productOptional = productRepository.findById(id);

        if(productOptional.isPresent()){
            return productOptional.get();
        }

        throw new ProductNotFoundException("Product not found "+id);
    }
}

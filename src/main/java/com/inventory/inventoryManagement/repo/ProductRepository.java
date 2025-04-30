package com.inventory.inventoryManagement.repo;

import com.inventory.inventoryManagement.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {

    Optional<Product> findById(String id);
}

package com.inventory.inventoryManagement.repo;

import com.inventory.inventoryManagement.entities.PromoCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PromoCodeRepository extends JpaRepository<PromoCode,String> {

    Optional<PromoCode> findByCode(String code);


}

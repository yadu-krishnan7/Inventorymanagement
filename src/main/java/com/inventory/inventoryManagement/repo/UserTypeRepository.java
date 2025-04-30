package com.inventory.inventoryManagement.repo;


import com.inventory.inventoryManagement.entities.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType,String> {

    Optional<UserType> findByType(String type);
}

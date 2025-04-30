package com.inventory.inventoryManagement.service.impl;

import com.inventory.inventoryManagement.entities.PromoCode;
import com.inventory.inventoryManagement.entities.UserType;
import com.inventory.inventoryManagement.exceptions.PromoCodeNotFoundException;
import com.inventory.inventoryManagement.exceptions.UserTypeNotFoundException;
import com.inventory.inventoryManagement.repo.UserTypeRepository;
import com.inventory.inventoryManagement.service.UserTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UserTypeServiceImpl implements UserTypeService {

    private final UserTypeRepository userTypeRepository;

    public UserTypeServiceImpl(UserTypeRepository userTypeRepository) {
        this.userTypeRepository = userTypeRepository;
    }

    @Override
    public UserType findByUserType(String type) {
        Optional<UserType> userTypeOptional = userTypeRepository.findByType(type);

        if(userTypeOptional.isPresent()){
            return userTypeOptional.get();
        }
        throw new UserTypeNotFoundException("user type not found "+type);
    }
}

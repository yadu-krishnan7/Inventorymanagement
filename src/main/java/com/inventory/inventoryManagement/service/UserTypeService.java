package com.inventory.inventoryManagement.service;

import com.inventory.inventoryManagement.entities.UserType;

public interface UserTypeService {

    UserType findByUserType(String type);
}

package com.inventory.inventoryManagement.exceptions;

public class UserTypeNotFoundException extends RuntimeException{

    public UserTypeNotFoundException(String message){
        super(message);
    }
}

package com.inventory.inventoryManagement.helper;

import com.inventory.inventoryManagement.exceptions.DiscountStrategyNotFound;

public class DiscountCalculatorHelper {

    public static final String PROMOCODE = "promoCode";
    public static final String PERCENTAGE = "percentage";
    public static final String QUANTITY = "quantity";
    public static final String USERTYPE = "userType";

    public static DiscountStrategy getDiscountStrategy(String type){

        if(type.equals(PROMOCODE)){
            return new PromoCodeDiscountStrategy();
        }
        if(type.equals(PERCENTAGE)){
            return new PercentageDiscountStrategy();
        }
        if(type.equals(QUANTITY)){
            return new QuantityDiscountStrategy();
        }
        if(type.equals(USERTYPE)){
            return new UserTypeDiscountStrategy();
        }

        throw new DiscountStrategyNotFound("Discount strategy not found please provide a valid type");
    }
}

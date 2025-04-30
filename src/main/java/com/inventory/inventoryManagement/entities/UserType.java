package com.inventory.inventoryManagement.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity(name = "user_types")

public class UserType {

    @Id
    private String type;

    private double discountPercentage;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserType userType)) return false;
        return Double.compare(discountPercentage, userType.discountPercentage) == 0 && Objects.equals(type, userType.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, discountPercentage);
    }

    @Override
    public String toString() {
        return "UserType{" +
                "type='" + type + '\'' +
                ", discountPercentage=" + discountPercentage +
                '}';
    }
}

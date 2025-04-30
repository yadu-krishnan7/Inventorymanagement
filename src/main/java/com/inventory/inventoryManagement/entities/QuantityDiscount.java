package com.inventory.inventoryManagement.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity(name = "quantity_discounts")
public class QuantityDiscount {

    @Id
    private int id;

    private int minQuantity;

    private double discountPercentage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(int minQuantity) {
        this.minQuantity = minQuantity;
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
        if (!(o instanceof QuantityDiscount that)) return false;
        return id == that.id && minQuantity == that.minQuantity && Double.compare(discountPercentage, that.discountPercentage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, minQuantity, discountPercentage);
    }

    @Override
    public String toString() {
        return "QuantityDiscount{" +
                "id=" + id +
                ", minQuantity=" + minQuantity +
                ", discountPercentage=" + discountPercentage +
                '}';
    }
}

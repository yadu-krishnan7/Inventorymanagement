package com.inventory.inventoryManagement.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Objects;

@Entity(name = "promo_codes")
public class PromoCode {

    @Id
    private String code;

    private double discountPercentage;

    private boolean active;

    private LocalDate validUntil;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(LocalDate validUntil) {
        this.validUntil = validUntil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PromoCode promoCode)) return false;
        return Double.compare(discountPercentage, promoCode.discountPercentage) == 0 && active == promoCode.active && Objects.equals(code, promoCode.code) && Objects.equals(validUntil, promoCode.validUntil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, discountPercentage, active, validUntil);
    }

    @Override
    public String toString() {
        return "PromoCode{" +
                "code='" + code + '\'' +
                ", discountPercentage=" + discountPercentage +
                ", active=" + active +
                ", validUntil=" + validUntil +
                '}';
    }
}

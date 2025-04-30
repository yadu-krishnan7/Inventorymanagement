package com.inventory.inventoryManagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity(name = "products")
public class Product {

    @Id
    private String id;

    private String name;

    private String description;

    private double basePrice;

    private String category;

    private long availableQuantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(long availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(basePrice, product.basePrice) == 0 && availableQuantity == product.availableQuantity && Objects.equals(id, product.id) && Objects.equals(name, product.name) && Objects.equals(description, product.description) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, basePrice, category, availableQuantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", basePrice=" + basePrice +
                ", category='" + category + '\'' +
                ", availableQuantity=" + availableQuantity +
                '}';
    }
}

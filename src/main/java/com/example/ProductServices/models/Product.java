package com.example.ProductServices.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    String name;
    String category;
    String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

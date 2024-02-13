package com.example.cocktailsthymeleaf;

import java.util.Arrays;
import java.util.List;

public class Cocktail {

    private Long id;
    private String name;
    private String[] ingredients;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    // Constructor for name and ingredients
    public Cocktail(String name, String[] ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    // Constructor for name only
    public Cocktail(String name) {
        this.name = name;
        this.ingredients = new String[0]; // Initialize an empty array for ingredients
    }
}

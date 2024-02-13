package com.example.cocktailsthymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CocktailService {

    private final CocktailRepository cocktailRepository;

    @Autowired
    public CocktailService(CocktailRepository cocktailRepository) {
        this.cocktailRepository = cocktailRepository;
    }

    public List<Cocktail> getAllCocktails() {
        return cocktailRepository.findAll();
    }

    public List<Cocktail> getCocktailsByIngredient(String ingredient) {
        List<Cocktail> allCocktails = cocktailRepository.findAll();
        List<Cocktail> cocktailsByIngredient = new ArrayList<>();

        for (Cocktail cocktail : allCocktails) {
            List<String> ingredients = List.of(cocktail.getIngredients());
            if (ingredients != null && ingredients.contains(ingredient)) {
                cocktailsByIngredient.add(cocktail);
            }
        }

        return cocktailsByIngredient;
    }
}

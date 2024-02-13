package com.example.cocktailsthymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CocktailController {

    @Autowired
    private CocktailService cocktailService;

    @GetMapping("/cocktails")
    public String getAllCocktails(Model model) {
        List<Cocktail> cocktails = cocktailService.getAllCocktails();
        model.addAttribute("cocktails", cocktails);
        return "cocktails";
    }

    @GetMapping("/cocktailsByIngredient")
    public String getCocktailsByIngredient(@RequestParam String ingredient, Model model) {
        List<Cocktail> cocktails = cocktailService.getCocktailsByIngredient(ingredient);
        model.addAttribute("cocktails", cocktails);
        return "cocktails";
    }
}

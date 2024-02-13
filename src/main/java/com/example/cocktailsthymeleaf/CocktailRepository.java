package com.example.cocktailsthymeleaf;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CocktailRepository {

    private List<Cocktail> cocktails;

    public CocktailRepository() {
        this.cocktails = createCocktailList();
    }

    public List<Cocktail> findAll() {
        return cocktails;
    }

    private List<Cocktail> createCocktailList() {
        List<Cocktail> cocktailList = new ArrayList<>();
        cocktailList.add(new Cocktail("Black Russian"));
        cocktailList.add(new Cocktail("Bloody Mary"));
        cocktailList.add(new Cocktail("Caipirinha"));
        cocktailList.add(new Cocktail("Champagne Cocktail"));
        cocktailList.add(new Cocktail("Cosmopolitan"));
        cocktailList.add(new Cocktail("Cuba Libre"));
        cocktailList.add(new Cocktail("French 75"));
        cocktailList.add(new Cocktail("French Connection"));
        cocktailList.add(new Cocktail("Godfather"));
        cocktailList.add(new Cocktail("Godmother"));
        cocktailList.add(new Cocktail("Golden Dream"));
        cocktailList.add(new Cocktail("Grasshopper"));
        cocktailList.add(new Cocktail("Harvey Wallbanger"));
        cocktailList.add(new Cocktail("Hemingway Special"));
        cocktailList.add(new Cocktail("Horses Neck"));
        cocktailList.add(new Cocktail("Irish Coffee"));
        cocktailList.add(new Cocktail("Kir"));
        cocktailList.add(new Cocktail("Long Island Iced Tea"));
        cocktailList.add(new Cocktail("Mai Tai"));
        cocktailList.add(new Cocktail("Margarita"));
        cocktailList.add(new Cocktail("Mimosa"));
        cocktailList.add(new Cocktail("Mint Julep"));
        cocktailList.add(new Cocktail("Mojito"));
        cocktailList.add(new Cocktail("Moscow Mule"));
        cocktailList.add(new Cocktail("Pina Colada"));
        cocktailList.add(new Cocktail("Rose"));
        cocktailList.add(new Cocktail("Sea Breeze"));
        cocktailList.add(new Cocktail("Sex On The Beach"));
        cocktailList.add(new Cocktail("Singapore Sling"));
        cocktailList.add(new Cocktail("Tequila Sunrise"));
        return cocktailList;
    }

    // Black Russian
    String[] blackRussianIngredients = {"Vodka", "Coffee liqueur"};
    Cocktail blackRussian = new Cocktail("Black Russian", blackRussianIngredients);

    // Bloody Mary
    String[] bloodyMaryIngredients = {"Vodka", "Tomato juice", "Spices"};
    Cocktail bloodyMary = new Cocktail("Bloody Mary", bloodyMaryIngredients);

    // Caipirinha
    String[] caipirinhaIngredients = {"Cachaça", "Lime", "Sugar"};
    Cocktail caipirinha = new Cocktail("Caipirinha", caipirinhaIngredients);

    // Champagne Cocktail
    String[] champagneCocktailIngredients = {"Champagne", "Sugar", "Angostura bitters"};
    Cocktail champagneCocktail = new Cocktail("Champagne Cocktail", champagneCocktailIngredients);

    // Cosmopolitan
    String[] cosmopolitanIngredients = {"Vodka", "Cranberry juice", "Lime juice", "Triple sec"};
    Cocktail cosmopolitan = new Cocktail("Cosmopolitan", cosmopolitanIngredients);

    // Cuba Libre
    String[] cubaLibreIngredients = {"Rum", "Cola", "Lime"};
    Cocktail cubaLibre = new Cocktail("Cuba Libre", cubaLibreIngredients);

    // French 75
    String[] french75Ingredients = {"Gin", "Champagne", "Lemon juice", "Sugar"};
    Cocktail french75 = new Cocktail("French 75", french75Ingredients);

    // French Connection
    String[] frenchConnectionIngredients = {"Cognac", "Amaretto"};
    Cocktail frenchConnection = new Cocktail("French Connection", frenchConnectionIngredients);

    // Godfather
    String[] godfatherIngredients = {"Scotch whisky", "Amaretto"};
    Cocktail godfather = new Cocktail("Godfather", godfatherIngredients);

    // Godmother
    String[] godmotherIngredients = {"Vodka", "Amaretto"};
    Cocktail godmother = new Cocktail("Godmother", godmotherIngredients);

    // Golden Dream
    String[] goldenDreamIngredients = {"Galliano", "Triple sec", "Orange juice", "Cream"};
    Cocktail goldenDream = new Cocktail("Golden Dream", goldenDreamIngredients);

    // Grasshopper
    String[] grasshopperIngredients = {"Crème de menthe", "Crème de cacao", "Cream"};
    Cocktail grasshopper = new Cocktail("Grasshopper", grasshopperIngredients);

    // Harvey Wallbanger
    String[] harveyWallbangerIngredients = {"Vodka", "Galliano", "Orange juice"};
    Cocktail harveyWallbanger = new Cocktail("Harvey Wallbanger", harveyWallbangerIngredients);

    // Hemingway Special
    String[] hemingwaySpecialIngredients = {"White rum", "Maraschino liqueur", "Grapefruit juice", "Lime juice"};
    Cocktail hemingwaySpecial = new Cocktail("Hemingway Special", hemingwaySpecialIngredients);

    // Horse's Neck
    String[] horsesNeckIngredients = {"Brandy", "Ginger ale", "Angostura bitters"};
    Cocktail horsesNeck = new Cocktail("Horse's Neck", horsesNeckIngredients);

    // Irish Coffee
    String[] irishCoffeeIngredients = {"Irish whiskey", "Coffee", "Cream", "Sugar"};
    Cocktail irishCoffee = new Cocktail("Irish Coffee", irishCoffeeIngredients);

    // Kir
    String[] kirIngredients = {"White wine", "Crème de cassis"};
    Cocktail kir = new Cocktail("Kir", kirIngredients);

    // Long Island Iced Tea
    String[] longIslandIcedTeaIngredients = {"Vodka", "Tequila", "Rum", "Gin", "Triple sec", "Lemon juice", "Cola"};
    Cocktail longIslandIcedTea = new Cocktail("Long Island Iced Tea", longIslandIcedTeaIngredients);

    // Mai Tai
    String[] maiTaiIngredients = {"Rum", "Lime juice", "Orgeat syrup", "Orange liqueur"};
    Cocktail maiTai = new Cocktail("Mai Tai", maiTaiIngredients);

    // Margarita
    String[] margaritaIngredients = {"Tequila", "Lime juice", "Triple sec"};
    Cocktail margarita = new Cocktail("Margarita", margaritaIngredients);

    // Mimosa
    String[] mimosaIngredients = {"Champagne", "Orange juice"};
    Cocktail mimosa = new Cocktail("Mimosa", mimosaIngredients);

    // Mint Julep
    String[] mintJulepIngredients = {"Bourbon", "Mint", "Sugar"};
    Cocktail mintJulep = new Cocktail("Mint Julep", mintJulepIngredients);

    // Mojito
    String[] mojitoIngredients = {"White rum", "Lime", "Mint", "Sugar", "Soda water"};
    Cocktail mojito = new Cocktail("Mojito", mojitoIngredients);

    // Moscow Mule
    String[] moscowMuleIngredients = {"Vodka", "Lime juice", "Ginger beer"};
    Cocktail moscowMule = new Cocktail("Moscow Mule", moscowMuleIngredients);

    // Pina Colada
    String[] pinaColadaIngredients = {"Rum", "Coconut cream", "Pineapple juice"};

}

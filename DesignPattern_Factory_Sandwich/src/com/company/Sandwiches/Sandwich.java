package com.company.Sandwiches;

import com.company.Ingredients.Breads.Bread;
import com.company.Ingredients.Cheeses.Cheese;
import com.company.Ingredients.Ingredient;
import com.company.Ingredients.Meats.Meat;
import com.company.Recipes.Recipe;
import com.company.Ingredients.Sauces.Sauce;
import com.company.Ingredients.Vegetables.Vegetables;

public class Sandwich {

    public String name;
    public Bread bread;
    public Meat[] meat;
    public Cheese[] cheese;
    public Vegetables[] vegetables;
    public Sauce[] sauce;

    public Sandwich(String name, Recipe recipe) {
        this.name = name;
        this.bread = recipe.chooseBread();
        this.meat = recipe.chooseMeat();
        this.cheese = recipe.chooseCheese();
        this.vegetables = recipe.chooseVegetables();
        this.sauce = recipe.chooseSauce();
    }

    public void cutTheBread(){
        System.out.println("1 - Cutting the " + bread);
    }

    public void includeIngredients(){
        System.out.println("2 - Including the following ingredients:");
        printListOfIngredients(meat);
        printListOfIngredients(cheese);
        printListOfIngredients(vegetables);
        printListOfIngredients(sauce);

    }

    public void wrapInPaper(){
        System.out.println("3 - Wrapping \"" + name + "\" in paper");
    }

    public void giveToCustomer(){
        System.out.println("4 - Handing \"" + name + "\" to the customer");
    }

    private void printListOfIngredients (Ingredient[] ingredients){
        if(ingredients!=null) {
            for (Ingredient ingredient : ingredients) {
                System.out.println("\t\t- " + ingredient);
            }
        }
    }

}

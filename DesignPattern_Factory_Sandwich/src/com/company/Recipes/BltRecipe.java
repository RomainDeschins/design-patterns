package com.company.Recipes;

import com.company.Ingredients.Breads.AmericanSandwichBread;
import com.company.Ingredients.Breads.Bread;
import com.company.Ingredients.Cheeses.Cheese;
import com.company.Ingredients.Meats.Bacon;
import com.company.Ingredients.Meats.Meat;
import com.company.Ingredients.Sauces.Mayonnaise;
import com.company.Ingredients.Sauces.Sauce;
import com.company.Ingredients.Vegetables.Lettuce;
import com.company.Ingredients.Vegetables.Tomatoes;
import com.company.Ingredients.Vegetables.Vegetables;

public class BltRecipe implements Recipe {

    @Override
    public Bread chooseBread() {
        return new AmericanSandwichBread();
    }

    @Override
    public Meat[] chooseMeat() {
        return new Meat[]{new Bacon()};
    }

    @Override
    public Cheese[] chooseCheese() {
        return null;
    }

    @Override
    public Vegetables[] chooseVegetables() {
        return new Vegetables[]{new Lettuce(), new Tomatoes()};
    }

    @Override
    public Sauce[] chooseSauce() {
        return new Sauce[]{new Mayonnaise()};
    }
}

package com.company.Recipes;

import com.company.Ingredients.Breads.Bread;
import com.company.Ingredients.Breads.ItalianCiabatta;
import com.company.Ingredients.Cheeses.Cheese;
import com.company.Ingredients.Cheeses.Mozzarella;
import com.company.Ingredients.Meats.Meat;
import com.company.Ingredients.Sauces.Pesto;
import com.company.Ingredients.Sauces.Sauce;
import com.company.Ingredients.Vegetables.FreshBasil;
import com.company.Ingredients.Vegetables.Tomatoes;
import com.company.Ingredients.Vegetables.Vegetables;

public class TomatoMozzarellaRecipe implements Recipe {

    @Override
    public Bread chooseBread() {
        return new ItalianCiabatta();
    }

    @Override
    public Meat[] chooseMeat() {
        return null;
    }

    @Override
    public Cheese[] chooseCheese() {
        return new Cheese[]{new Mozzarella()};
    }

    @Override
    public Vegetables[] chooseVegetables() {
        return new Vegetables[]{new FreshBasil(), new Tomatoes()};
    }

    @Override
    public Sauce[] chooseSauce() {
        return new Sauce[]{new Pesto()};
    }
}

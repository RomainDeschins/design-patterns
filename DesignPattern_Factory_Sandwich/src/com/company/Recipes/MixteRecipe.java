package com.company.Recipes;

import com.company.Ingredients.Breads.Bread;
import com.company.Ingredients.Breads.FrenchBaguette;
import com.company.Ingredients.Cheeses.Cheese;
import com.company.Ingredients.Cheeses.Emmental;
import com.company.Ingredients.Meats.Ham;
import com.company.Ingredients.Meats.Meat;
import com.company.Ingredients.Sauces.Butter;
import com.company.Ingredients.Sauces.Sauce;
import com.company.Ingredients.Vegetables.Vegetables;

public class MixteRecipe implements Recipe {

    @Override
    public Bread chooseBread() {
        return new FrenchBaguette();
    }

    @Override
    public Meat[] chooseMeat() {
        return new Meat[]{new Ham()};
    }

    @Override
    public Cheese[] chooseCheese() {
        return new Cheese[]{new Emmental()};
    }

    @Override
    public Vegetables[] chooseVegetables() {
        return null;
    }

    @Override
    public Sauce[] chooseSauce() {
        return new Sauce[]{new Butter()};
    }
}

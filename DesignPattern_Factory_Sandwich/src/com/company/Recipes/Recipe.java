package com.company.Recipes;

import com.company.Ingredients.Breads.Bread;
import com.company.Ingredients.Cheeses.Cheese;
import com.company.Ingredients.Meats.Meat;
import com.company.Ingredients.Sauces.Sauce;
import com.company.Ingredients.Vegetables.Vegetables;

public interface Recipe {

    public abstract Bread chooseBread();
    public abstract Meat[] chooseMeat();
    public abstract Cheese[] chooseCheese();
    public abstract Vegetables[] chooseVegetables();
    public abstract Sauce[] chooseSauce();

}

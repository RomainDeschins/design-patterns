package com.company.Shops;

import com.company.Recipes.*;
import com.company.Sandwiches.*;

import java.util.ArrayList;

public class LaSandwicherieAmericanShop extends LaSandwicherie {

    public LaSandwicherieAmericanShop() {
        this.shopNationality = "American";
    }

    {
        this.menu= new ArrayList<>();
        menu.add("A French");
        menu.add("A Local");
        menu.add("An Italian");
        menu.add("A German");
    }

    @Override
    public Sandwich sandwichMaking(String sandwichName) {
        Recipe recipe;

        switch (sandwichName){

            case "A French":
                recipe = new MixteRecipe();
                break;

            case "A Local":
                recipe = new BltRecipe();
                break;

            case "An Italian":
                recipe = new TomatoMozzarellaRecipe();
                break;

            case "A German":
                recipe = new SchnitzelSandwichRecipe();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + sandwichName);
        }
        return new Sandwich(sandwichName, recipe);
    }

}

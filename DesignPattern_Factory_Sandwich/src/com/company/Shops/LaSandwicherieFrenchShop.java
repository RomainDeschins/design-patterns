package com.company.Shops;

import com.company.Recipes.*;
import com.company.Sandwiches.*;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class LaSandwicherieFrenchShop extends LaSandwicherie {

    public LaSandwicherieFrenchShop() {
        this.shopNationality = "French";
    }

    {
        this.menu = new ArrayList<>();
        menu.add("Un Local");
        menu.add("Un Americain");
        menu.add("Un Italien");
        menu.add("Un Allemand");
    }

    @Override
    public Sandwich sandwichMaking(String sandwichName) {
        Recipe recipe;

        switch (sandwichName){

            case "Un Local":
                recipe = new MixteRecipe();
                break;

            case "Un Americain":
                recipe = new BltRecipe();
                break;

            case "Un Italien":
                recipe = new TomatoMozzarellaRecipe();
                break;

            case "Un Allemand":
                recipe = new SchnitzelSandwichRecipe();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + sandwichName);
        }

        return new Sandwich(sandwichName, recipe);
    }

}

package com.company.Shops;

import com.company.Recipes.*;
import com.company.Sandwiches.*;

import java.util.ArrayList;

public class LaSandwicherieGermanShop extends LaSandwicherie {

    public LaSandwicherieGermanShop() {
        this.shopNationality = "German";
    }

    {
        this.menu= new ArrayList<>();
        menu.add("Ein Franzoesisches");
        menu.add("Ein Americanisches");
        menu.add("Ein Italianisches");
        menu.add("Ein Lokales");
    }

    @Override
    public Sandwich sandwichMaking(String sandwichName) {
        Recipe recipe;

        switch (sandwichName){

            case "Ein Franzoesisches":
                recipe = new MixteRecipe();
                break;

            case "Ein Americanisches":
                recipe = new BltRecipe();
                break;

            case "Ein Italianisches":
                recipe = new TomatoMozzarellaRecipe();
                break;

            case "Ein Lokales":
                recipe = new SchnitzelSandwichRecipe();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + sandwichName);
        }
        return new Sandwich(sandwichName, recipe);
    }

}

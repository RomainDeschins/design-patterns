package com.company.Shops;

import com.company.Recipes.*;
import com.company.Sandwiches.*;

import java.util.ArrayList;

public class LaSandwicherieItalianShop extends LaSandwicherie{

    public LaSandwicherieItalianShop() {
        this.shopNationality = "Italian";
    }

    {
        this.menu= new ArrayList<>();
        menu.add("Un Francese");
        menu.add("Un Americano");
        menu.add("Un Locale");
        menu.add("Un Tedesco");
    }

    @Override
    public Sandwich sandwichMaking(String sandwichName) {
        Recipe recipe;

        switch (sandwichName){

            case "Un Francese":
                recipe = new MixteRecipe();
                break;

            case "Un Americano":
                recipe = new BltRecipe();
                break;

            case "Un Locale":
                recipe = new TomatoMozzarellaRecipe();
                break;

            case "Un Tedesco":
                recipe = new SchnitzelSandwichRecipe();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + sandwichName);
        }
        return new Sandwich(sandwichName, recipe);
    }

}

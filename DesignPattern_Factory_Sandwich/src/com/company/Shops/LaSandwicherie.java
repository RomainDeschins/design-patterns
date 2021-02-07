package com.company.Shops;

import com.company.Sandwiches.Sandwich;

import java.util.ArrayList;

public abstract class LaSandwicherie {

    public ArrayList<String> menu;
    public String shopNationality;

    public Sandwich orderSandwich(String sandwichName){
        Sandwich sandwich = sandwichMaking(sandwichName);

        System.out.println("\nYou ordered \"" + sandwich.name + "\".");

        sandwich.cutTheBread();
        sandwich.includeIngredients();
        sandwich.wrapInPaper();
        sandwich.giveToCustomer();
        return sandwich;
    }

    public abstract Sandwich sandwichMaking(String sandwichName);

    public void printGreetingMessage() {
        System.out.println("\nWELCOME IN OUR " + shopNationality + " SHOP");
    }

    public void printMenu(){
        System.out.println("Menu of the " + shopNationality + " Sandwicherie:");
        for(String sandwishName : menu){
            System.out.println("\t- " + sandwishName);
        }
    }


}

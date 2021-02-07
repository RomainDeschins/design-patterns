package com.company;

import com.company.Sandwiches.Sandwich;
import com.company.Shops.*;

import java.util.HashMap;
import java.util.Scanner;

public class UserInputValidation {

    private HashMap<String, LaSandwicherie> locationsMap = new HashMap<>();

    {
        locationsMap.put("France", new LaSandwicherieFrenchShop());
        locationsMap.put("USA", new LaSandwicherieAmericanShop());
        locationsMap.put("Italy", new LaSandwicherieItalianShop());
        locationsMap.put("Germany", new LaSandwicherieGermanShop());
    }

    public LaSandwicherie chooseLocation(){
        LaSandwicherie userSandwicherie = null;
        Scanner scanner = new Scanner(System.in);

        while (userSandwicherie == null){
            printListOfLocations();
            System.out.println("\nWhere are you located?");
            String userInput = scanner.nextLine();
            userSandwicherie = checkLocation(userInput);
        }
        userSandwicherie.printGreetingMessage();
        return userSandwicherie;
    }

    private void printListOfLocations(){
        System.out.println("\nWe currently have shops in the following countries:");
        for (String location : locationsMap.keySet()){
            System.out.println("\t- " + location);
        }
    }

    private LaSandwicherie checkLocation (String userInput){
        LaSandwicherie sandwicherie = null;

        LOCATION_LOOP: for (String location : locationsMap.keySet()){
            if (location.equals(userInput)){
                sandwicherie = locationsMap.get(location);
                break LOCATION_LOOP;
            }
        }
        return sandwicherie;
    }

    public Sandwich chooseSandwich(LaSandwicherie sandwicherie){
        Sandwich sandwich = null;
        Scanner scanner = new Scanner(System.in);
        String userInput = null;

        sandwicherie.printMenu();

        while (sandwich == null){
            System.out.println("\nWhich sandwich would you like?");
            userInput = scanner.nextLine();
            sandwich = checkSandwich(sandwicherie, userInput);
        }
        sandwicherie.orderSandwich(userInput);
        return sandwich;
    }

    private Sandwich checkSandwich(LaSandwicherie sandwicherie, String userInput){
        Sandwich sandwich = null;

        SANDIWCH_LOOP: for(String sandwichName : sandwicherie.menu){
            if (sandwichName.equals(userInput)){
                sandwich = sandwicherie.sandwichMaking(userInput);
                break SANDIWCH_LOOP;
            }
        }
        return sandwich;
    }




}

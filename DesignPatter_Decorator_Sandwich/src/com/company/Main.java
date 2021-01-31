package com.company;

import com.company.Breads.WhiteBread;
import com.company.Meats.Chicken;
import com.company.Sauces.BBQSauce;
import com.company.Vegetables.Lettuce;
import com.company.Vegetables.Tomatoes;

public class Main {

    public static void main(String[] args) {

        Sandwich sandwichOne = new WhiteBread("Mary");
        sandwichOne = new BBQSauce(sandwichOne);
        sandwichOne = new Chicken(sandwichOne);
        sandwichOne = new Lettuce(sandwichOne);
        sandwichOne = new Tomatoes(sandwichOne);

        System.out.println(sandwichOne.getDescription());
        System.out.println(sandwichOne.getPrice());



    }
}

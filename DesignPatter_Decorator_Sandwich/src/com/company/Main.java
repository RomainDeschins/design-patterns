package com.company;

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

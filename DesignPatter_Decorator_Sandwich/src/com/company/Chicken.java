package com.company;

public class Chicken extends Meats{

    public double price = 1.19;

    public Chicken(Sandwich sandwich) {
        this.name = "Chicken";
        this.sandwich = sandwich;
    }

    @Override
    public double getPrice() {
        return sandwich.getPrice() + this.price;
    }

}

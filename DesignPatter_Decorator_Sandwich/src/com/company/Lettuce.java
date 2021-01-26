package com.company;

public class Lettuce extends Vegetables {

    public double price = 0.29;

    public Lettuce(Sandwich sandwich) {
        this.name = "Lettuce";
        this.sandwich = sandwich;
    }

    @Override
    public double getPrice() {
        return sandwich.getPrice() + price;
    }
}

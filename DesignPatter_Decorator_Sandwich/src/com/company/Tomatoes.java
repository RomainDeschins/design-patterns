package com.company;

public class Tomatoes extends Vegetables {

    public double price = 0.49;

    public Tomatoes(Sandwich sandwich) {
        this.name = "Tomatoes";
        this.sandwich = sandwich;
    }

    @Override
    public double getPrice() {
        return sandwich.getPrice() + this.price;
    }
}

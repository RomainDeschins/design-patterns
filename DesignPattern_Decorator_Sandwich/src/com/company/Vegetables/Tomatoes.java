package com.company.Vegetables;

import com.company.Sandwich;
import com.company.Vegetables.Vegetables;

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

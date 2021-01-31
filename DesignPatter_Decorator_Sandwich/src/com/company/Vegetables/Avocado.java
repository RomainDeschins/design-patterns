package com.company.Vegetables;

import com.company.Sandwich;
import com.company.Vegetables.Vegetables;

public class Avocado extends Vegetables {

    public double price = 0.89;

    public Avocado(Sandwich sandwich) {
        this.name = "Avocado";
        this.sandwich = sandwich;
    }

    @Override
    public double getPrice() {
        return sandwich.getPrice() + this.price;
    }

}

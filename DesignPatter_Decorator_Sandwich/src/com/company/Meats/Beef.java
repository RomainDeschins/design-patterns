package com.company.Meats;

import com.company.Meats.Meats;
import com.company.Sandwich;

public class Beef extends Meats {

    public double price = 1.39;

    public Beef(Sandwich sandwich) {
        this.name = "Beef";
        this.sandwich = sandwich;
    }

    @Override
    public double getPrice() {
        return sandwich.getPrice() + this.price;
    }

}

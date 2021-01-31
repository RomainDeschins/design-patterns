package com.company.Sauces;

import com.company.ToppingsDecorators;

public abstract class Sauces extends ToppingsDecorators {

    public double price = 0.49;

    @Override
    public double getPrice() {
        return sandwich.getPrice() + price;
    }

}

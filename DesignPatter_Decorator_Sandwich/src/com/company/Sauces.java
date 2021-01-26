package com.company;

public abstract class Sauces extends ToppingsDecorators{

    public double price = 0.49;

    @Override
    public double getPrice() {
        return sandwich.getPrice() + price;
    }

}

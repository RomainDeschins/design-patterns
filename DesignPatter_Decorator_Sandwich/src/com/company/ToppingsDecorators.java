package com.company;

public abstract class ToppingsDecorators extends Sandwich {

    Sandwich sandwich;

    public String getDescription() {
        return sandwich.getDescription() + "\t- " +this.name + "\n";
    }

}

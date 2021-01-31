package com.company;

public abstract class ToppingsDecorators extends Sandwich {

    public Sandwich sandwich;

    public String getDescription() {
        return sandwich.getDescription() + "\t- " +this.name + "\n";
    }

}

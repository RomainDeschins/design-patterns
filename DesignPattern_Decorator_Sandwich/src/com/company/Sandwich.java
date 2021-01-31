package com.company;

public abstract class Sandwich {

    public String name;
    public String customerName;
    public double price;

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return "Customer Name: " + this.customerName + "\nType of Bread: " + this.name + "\nList of Ingredients:\n";
    }

}

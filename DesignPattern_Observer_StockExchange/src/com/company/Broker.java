package com.company;

import java.util.ArrayList;

public class Broker extends Observer{

    public Broker(String name, Subject stockExchange) {
        super(name,stockExchange);
    }

    @Override
    public void update(Subject stockExchange) {
        if (stockExchange instanceof StockExchange){
            this.listOfStocks = ((StockExchange) stockExchange).getAllStocks();
            printInformation();
        }
    }
}

package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;

public abstract class Observer {
    // I have used an abstract class instead of an interface in order to decrease code duplication through the use of inheritance
    // Drawback: The Observer behaviors cannot be added to an existing class that already extend a superclass (this is ok in the current context)
    public String name;
    public ArrayList<Stock> listOfStocks;
    public Subject stockExchange;

    public Observer(String name, Subject stockExchange) {
        this.name = name;
        this.stockExchange = stockExchange;
        this.stockExchange.addObserver(this);
    }

    // Method used for a Push Model
//    public void update(ArrayList<Stock> listOfStocks) {
//        this.listOfStocks = listOfStocks;
//        printInformation();
//    }

    public abstract void update(Subject stockExchange);

    public void printInformation(){
        if(listOfStocks.isEmpty()){
            return;
        }
        printInformationIntroductionSentence();
        printInformationListOfStocks();
    }

    public void printInformationIntroductionSentence(){
        String className = this.getClass().getSimpleName();
        System.out.println("\n" + name + " (" + className + ") observes the following stocks:");
    }

    public void printInformationListOfStocks(){
        for(Stock stock:listOfStocks){
            System.out.println("\t" + stock.getStockName() + ": " + new DecimalFormat("EUR ##.00").format(stock.getStockPrice()));
        }
    }

}
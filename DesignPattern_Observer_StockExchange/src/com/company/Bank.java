package com.company;

import java.util.ArrayList;

public class Bank extends Observer{
    private String bankingLicenceNumber;

    public Bank(String name, String bankingLicenceNumber, Subject stockExchange) {
        super(name,stockExchange);
        this.bankingLicenceNumber = bankingLicenceNumber;
    }

    @Override
    public void update(Subject stockExchange) {
        if (stockExchange instanceof StockExchange){
            this.listOfStocks = ((StockExchange) stockExchange).getAllStocks();
            printInformation();
        }
    }

    @Override
    public void printInformationIntroductionSentence() {
        String className = this.getClass().getSimpleName();
        System.out.println("\n" + name + " (" + className + " - Licence number: " + bankingLicenceNumber + ") observes the following stocks:");
    }
}

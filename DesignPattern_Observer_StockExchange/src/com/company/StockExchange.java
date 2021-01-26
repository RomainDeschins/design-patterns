package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class StockExchange implements Subject{
    private String stockExchangeName;
    private ArrayList<Observer> listOfObservers;
    private ArrayList<Stock> listOfStocks;

    public StockExchange(String stockExchangeName) {
        this.stockExchangeName = stockExchangeName;
        this.listOfStocks = new ArrayList<Stock>();
        this.listOfObservers = new ArrayList<Observer>();
    }

    public void addStock (Stock stock){
        listOfStocks.add(stock);
        System.out.println("The " + stock.getStockName() + " stock (" + new DecimalFormat("EUR ##.00").format(stock.getStockPrice()) +") has been added to the " + stockExchangeName + ".");
    }

    public void removeStock(Stock stock){
        int i = listOfStocks.indexOf(stock);
        if (i >= 0){
            listOfStocks.remove(i);
            System.out.println(stock.getStockName() + " has been remove from the " + stockExchangeName + ". An updated list must be sent to the Observers");
        }
        setNewPrices();
    }

    @Override
    public void addObserver(Observer observer){
        listOfObservers.add(observer);
    }

    @Override
    public void removeObserver (Observer observer){
        int i = listOfObservers.indexOf(observer);
        if (i >= 0){
            listOfObservers.remove(i);
        }
    }

    // Method used for a Push Model
//    @Override
//    public void updateObserver(){
//        for (Observer observer : listOfObservers){
//            observer.update(listOfStocks);
//        }
//        System.out.println("\nObservers have been updated.");
//    }

    // Method used for a Pull Model
    @Override
    public void updateObserver(){
        for (Observer observer : listOfObservers){
            observer.update(this);
        }
    }

    public ArrayList<Stock> getAllStocks(){
        return listOfStocks;
    }

    public ArrayList<Stock> getOnlyCertainStocks(ArrayList<Stock> stocksToGet){
        ArrayList<Stock> listToSend = new ArrayList<>();
        for (Stock stock : listOfStocks){
            for (Stock stockToCheck : stocksToGet){
                if(stock.getStockName().equals(stockToCheck.getStockName())){
                    listToSend.add(stock);
                }
            }
        }
        return listToSend;
    }

    public void setNewPrices(){
        for (Stock stock : listOfStocks){
            stock.setStockPrice(Math.random()*(10 - 0 + 1) + 0);
        }
        System.out.println("\nPrices have changed.");
        updateObserver();
    }

}
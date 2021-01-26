package com.company;

import java.util.ArrayList;

public class Individual extends Observer{
    public ArrayList<Stock> listOfStocksToFollow;

    public Individual(String name, Subject stockExchange) {
        super(name,stockExchange);
        this.listOfStocksToFollow = new ArrayList<Stock>();
    }

    public void addStockToFollow(Stock stockToAdd){
        this.listOfStocksToFollow.add(stockToAdd);
    }

    public void unfollowStock(Stock stockToDelete){
        int i = listOfStocksToFollow.indexOf(stockToDelete);
        if (i >= 0){
            listOfStocksToFollow.remove(i);
        }
    }

    @Override
    public void update(Subject stockExchange) {
        if (stockExchange instanceof StockExchange){
            this.listOfStocks = ((StockExchange) stockExchange).getOnlyCertainStocks(listOfStocksToFollow);
            printInformation();
        }
    }




}

package com.company;

public class Main {

    public static void main(String[] args) {
        StockExchange frankfurtStockExchange = new StockExchange("Frankfurt Stock Exchange (XFRA)");

        Stock volkswagenStock = new Stock("Volkswagen", 7.84);
        Stock daimlerStock = new Stock("Daimler", 4.58);
        Stock bmwStock = new Stock("BMW", 3.43);
        Stock continentalStock = new Stock("Continental", 6.26);
        Stock basfStock = new Stock("BASF", 5.9);
        Stock bayerSotck = new Stock("Bayer", 8.61);
        Stock beierdorfStock = new Stock("Beiersdorf", 4.48);

        frankfurtStockExchange.addStock(volkswagenStock);
        frankfurtStockExchange.addStock(daimlerStock);
        frankfurtStockExchange.addStock(bmwStock);
        frankfurtStockExchange.addStock(continentalStock);
        frankfurtStockExchange.addStock(basfStock);
        frankfurtStockExchange.addStock(bayerSotck);
        frankfurtStockExchange.addStock(beierdorfStock);

        Broker interactiveBroker = new Broker("Interactive Broker", frankfurtStockExchange);
        Bank societeGeneral = new Bank("Société Générale", "1234", frankfurtStockExchange);
        Bank deutscheBank = new Bank("Deutsche Bank", "4321", frankfurtStockExchange);
        Individual mrBing = new Individual("Mr Bing", frankfurtStockExchange);
        Individual mrsRobinson = new Individual("Mrs Robinson", frankfurtStockExchange);

        mrBing.addStockToFollow(volkswagenStock);
        mrBing.addStockToFollow(daimlerStock);
        mrBing.addStockToFollow(bmwStock);

        mrsRobinson.addStockToFollow(basfStock);
        mrsRobinson.addStockToFollow(bayerSotck);
        mrsRobinson.addStockToFollow(beierdorfStock);

        frankfurtStockExchange.setNewPrices();

        mrsRobinson.unfollowStock(beierdorfStock);

        frankfurtStockExchange.setNewPrices();

        frankfurtStockExchange.removeStock(bayerSotck);

        frankfurtStockExchange.removeObserver(mrsRobinson);

        frankfurtStockExchange.setNewPrices();


    }
}

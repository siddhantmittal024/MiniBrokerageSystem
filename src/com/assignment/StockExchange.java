package com.assignment;
import java.util.*;

// Two StockExchanges namely NSE and BSE
// Stocks will be stored in each accordingly
// A stock can be added to NSE,BSE or both.
// Create a new stock and add it to StockExchange
class StockExchange{
    //ticker for the stock
    String exchangeName;
    // arraylist for NSE stockExchange
    private final ArrayList<Stock> NSE = new ArrayList<Stock>();
    // arraylist for BSE stockExchange
    private final ArrayList<Stock> BSE = new ArrayList<Stock>();
    // to add stocks to stockExchange
    private HashMap<String,Stock> stocks = new HashMap<String,Stock>();

    //creating/initiating a new stockExchange namely NSE/BSE
    public StockExchange(String name) {
        this.stocks = new HashMap<String, Stock>();
        this.exchangeName = name;
    }

    // add a new stock to the stockExchange
    public void addStock(String scrip, String sect, double open, double high, double low, double close) {
        Stock st = new Stock(sect, open, high, low, close);
        stocks.put(scrip, st);
        System.out.println("Added scrip: " + scrip);
    }

    // returns all stocks registered in the stockExchange
    public void getAllStocks() {
        System.out.println("Scrips:");
        for (String tick : stocks.keySet()) {
            String temp = "Scrip : " + tick + ", Sector : " + stocks.get(tick).getSector() + ", ";
            temp += stocks.get(tick).toString();
            System.out.println(temp);
        }
    }

    // to return stock of a particular ticker
    public Stock getIndividualStock(String ticker){
        return stocks.get(ticker);
    }

    // to return all stocks sector-wise
    public void getSectorWiseStocks(String sect) {
        System.out.println("Scripts listed in " + sect + ":");
        for (String tick : stocks.keySet()) {
            if (stocks.get(tick).getSector().equals(sect)) {
                String temp =  "Scrip : " + tick + ", ";
                temp += stocks.get(tick).toString();
                System.out.println(temp);
            }
        }
    }

    // delete a stock for a given ticker
    public void deleteStock(String ticker) {
        //Delete Stock from here
        System.out.println("Deleted scrip: " + ticker);
        stocks.remove(ticker);
    }

}

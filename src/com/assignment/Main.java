package com.assignment;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Stock s1 = new Stock("INFY", "PHARMA", 890, 890, 890, 890);
        Stock s2 = new Stock("TCS", "IT", 900, 900, 890, 890);

        StockExchange se = new StockExchange();
        se.addStock(s1);
        se.addStock(s2);
        se.getStockInfo();
        se.deleteStock("INFY");
        se.getStockInfo();
       
    }
}

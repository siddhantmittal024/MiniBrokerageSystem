package com.assignment;
;
import java.util.*;

// Two StockExchanges namely NSE and BSE
// Stocks will be stored in each accordingly
// A stock can be added to NSE,BSE or both.
// Create a new stock and add it to StockExchange

class StockExchange{
    private ArrayList<Stock> NSE = new ArrayList<Stock>();
    private ArrayList<Stock> BSE = new ArrayList<Stock>();

    void addStock(Stock stock) {
        String c;
        Scanner s = new Scanner(System.in);
        System.out.print("In which stock exchange to insert(NSE/BSE/BOTH):");
        c = s.next();
        switch (c) {
            case "NSE":
                NSE.add(stock);
                System.out.println("Stock successfully added!");
                break;
            case "BSE":
                BSE.add(stock);
                System.out.println("Stock successfully added!");
                break;
            case "BOTH":
                NSE.add(stock);
                BSE.add(stock);
                System.out.println("Stock successfully added!");
                break;
            default:
                System.out.println("Please select one!");
                break;
        }
    }

    void getStockInfo(){
            for(Stock i: NSE){
                System.out.println(i);
            }
        for(Stock i: BSE){
            System.out.println(i);
        }
    }

    void deleteStock(String c){
        NSE.removeIf(i -> i.scrip == (c));
        BSE.removeIf(i -> i.scrip == (c));
        System.out.println("Stock successfully deleted!");
    }



}

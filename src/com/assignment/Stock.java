package com.assignment;
// creating the class for a stock with following parameters
public class Stock{
    //variables required for creating a stock
    String scrip;
    String sector;
    double openPrice;
    double highPrice;
    double lowPrice;
    double closePrice;

    // instantiating a new empty stock object
    public Stock(){
        this.sector="";
        this.openPrice=0;
        this.highPrice=0;
        this.lowPrice=0;
        this.closePrice=0;
    }

// constructor for adding the following data
    public Stock(String s,String sec, double o, double h,double l,double c) {
        // adding scrip present at index 0 of array
        this.scrip = s;
        // adding sector
        this.sector = sec;
        // adding openPrice
        this.openPrice = o;
        // adding highPrice
        this.highPrice = h;
        // adding lowPrice
        this.lowPrice = l;
        // adding closePrice
        this.closePrice = c;
    }

    //constructor for stock class to create a new stock for given ticker in stockExchange
    public Stock(String sec,double o,double h,double l,double c){
        this.sector = sec;
        this.openPrice = o;
        this.highPrice = h;
        this.lowPrice = l;
        this.closePrice = c;
    }

//getter method for stock name
    public String getName() {
        return scrip;
    }

//setter method for stock name
    public void setName(String scrip) {
        this.scrip = scrip;
    }

//getter method for sector
    public String getSector() {
        return sector;
    }

//setter method for sector
    public void setSector(String sector) {
        this.sector = sector;
    }

//getter method for closePrice
public double getClosePrice(){
        return closePrice;
}

//toString() method to print details
    @Override
    public String toString() {
        return  "O: " + openPrice +
                ", H: " + highPrice +
                ", L: " + lowPrice +
                ", C: " + closePrice;
    }
}

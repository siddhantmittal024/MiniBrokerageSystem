package com.assignment;
// creating the class for a stock with following parameters
public class Stock{
    String scrip;
    String sector;
    double openPrice;
    double highPrice;
    double lowPrice;
    double closePrice;

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
//toString() method to print details
    @Override
    public String toString() {
        return "Scrip='" + scrip + '\'' +
                ", Sector='" + sector + '\'' +
                ", openPrice=" + openPrice +
                ", highPrice=" + highPrice +
                ", lowPrice=" + lowPrice +
                ", closePrice=" + closePrice;
    }
}

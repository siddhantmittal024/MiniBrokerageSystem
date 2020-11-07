package com.assignment;

//Order class for creating and instantiating a new order!
public class Order {
    private String Ticker;
    private boolean buyOrder;
    private boolean sellOrder;
    private double rate;
    private boolean isOpen;
    private int quantity;
    private int userId;

// setting up a new order
    Order() {
        this.Ticker = "";
        this.buyOrder = false;
        this.sellOrder = false;
        this.rate = 0;
        this.isOpen = false;
        this.quantity = 0;
        this.userId = -1;
    }
// creating a new order for the following stock
    Order(String tick, boolean buyOrder, boolean sellOrder, double rate, int qty, int id) {
        this.Ticker = tick;
        this.buyOrder = buyOrder;
        this.sellOrder = sellOrder;
        this.quantity = qty;
        this.userId = id;
        this.isOpen = true;
        this.rate = rate;
    }

//method to set the rate
    public void setRate(double rate) {
        this.rate = rate;
    }
//method to return rate
    public double getRate() {
        return rate;
    }
//check if order is open
    public boolean isOpen() {
        return isOpen;
    }
//set the order open property
    public void setOpen(boolean open) {
        isOpen = open;
    }
//setting up the stock ticker
    public void setTicker(String stockTicker) {
        Ticker = stockTicker;
    }
//setting the type of order as BUY
    public void setBuyOrder(boolean buyOrder) {
        this.buyOrder = buyOrder;
    }
//setting the type of order as SELL
    public void setSellOrder(boolean sellOrder) {
        this.sellOrder = sellOrder;
    }
//setting order quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
//setting up userid for who placed the order
    public void setUserId(int orderMadeBy) {
        this.userId = orderMadeBy;
    }
//getting the stock ticker
    public String getStockTicker() {
        return Ticker;
    }
//type of order
    public boolean isBuyOrder() {
        return buyOrder;
    }
//type of order
    public boolean isSellOrder() {
        return sellOrder;
    }
//return quantity
    public int getQuantity() {
        return quantity;
    }
//who created the order
    public int getUserId() {
        return userId;
    }
//method to print order info
    public void  printOrderInfo() {
        String t = "";
        if (this.buyOrder) {
            t = "BUY";
        } else if (this.sellOrder) {
            t = "SELL";
        }
        System.out.println(t + " " + this.Ticker + " Qty: " + this.quantity + " Rate: " + this.rate + "\n");

    }
}

package com.assignment;

import java.util.HashMap;

//Trader class for registering a new trader to ouy system
public class Trader {
//declaring the required variables
    private String name;
    private Double funds;
    private final HashMap<String, Integer> holdings;
// constructor for trader class
    public Trader(String name, Double funds,HashMap<String,Integer> holding) {
        this.name = name;
        this.funds = funds;
        this.holdings=holding;
        System.out.println("Added new user: " + this.name);
    }
// getter method for name
    public String getName() {
        return name;
    }
// setting the name for the trader
    public void setName(String name) {
        this.name = name;
    }
// getter method for funds
    public Double getFunds() {
        return funds;
    }
// setter method for funds
    public void setFunds(Double funds) {
        this.funds = funds;
    }
// toString() method for printing the details
    @Override
    public String toString() {
        return "Trader { " +
                "name='" + name + '\'' +
                ", funds=" + funds +
                ", holdings=" + (holdings == null ? "None" : holdings) +
                " }";
    }
// method to print trader info
    void printTrader(Trader t){
        System.out.println("User: " + t.name + ", Funds: " + t.funds + " Holdings: " + t.holdings);
    }
// method to print all the registered traders
    void printAllTraders(){
        System.out.println("User: " + this.name + ", Funds: " + this.funds  + " Holdings: " + this.holdings);
    }
//method to remove a trader
    void removeOneTrader(Trader t){
        System.out.println("Removed trader!");
    }
}

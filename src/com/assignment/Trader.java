package com.assignment;
import java.util.HashMap;
import java.util.UUID;
//Trader class for registering a new trader to ouy system
// UUID is universally unique identifier which will be used for assigning a random and unique id to the user
public class Trader {
    private String name;
    private final UUID id;
    private Double funds;
    private HashMap<String, Integer> holdings;
// constructor for trader class
    public Trader(String name, Double funds) {
        this.name = name;
        this.funds = funds;
        this.id = UUID.randomUUID();
    }
// getter method for name
    public String getName() {
        return name;
    }
// setting the name for the trader
    public void setName(String name) {
        this.name = name;
    }
// returning the uniquely assigned id to the trader
    public UUID getId() {
        return id;
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
                ", id=" + id +
                ", funds=" + funds +
                ", holdings=" + (holdings == null ? "None" : holdings) +
                " }";
    }
}
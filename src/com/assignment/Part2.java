package com.assignment;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*
notes:
return of a stock is the profit/loss made by buying and selling of share
the max loss a person can make by selling/buying a stock / the lowest price for a given stock during given time is max drawdown
if closePrice>openPrice, stock is bullish that day
if closePrice<openPrice, stock is bearish that day
max-return-potential = net profit earned over the 15 days time period
 */

public class Part2 {
    public static void main(String[] args) {
        //starting the question first by extracting the given data for the stock
    try{
        System.out.println("\nPart2 of Assignment:" + "\n\n" + "Calculating the AveragePrice, MaxDrawdown, MaxReturnPotential: ");

        //reading the .csv file
        File f = new File("INFY_15days_data.csv");
        Scanner reader = new Scanner(f);

        //declaring the variables to store the extracted data separately
        ArrayList<Double> prevClosePrice = new ArrayList<Double>();
        ArrayList<Double> openPrice = new ArrayList<Double>();
        ArrayList<Double> closePrice = new ArrayList<Double>();
        ArrayList<Double> highPrice = new ArrayList<Double>();
        ArrayList<Double> lowPrice = new ArrayList<Double>();
        ArrayList<Double> lastPrice = new ArrayList<Double>();
        String data ="";
        int i=0;

        //extracting the data and storing it
        while(reader.hasNextLine()){
            data = reader.nextLine();
            if(i==0){
                i++;
            }
            else {
                String[] info = data.split(",");
                prevClosePrice.add(Double.parseDouble(info[2]));
                openPrice.add(Double.parseDouble(info[3]));
                highPrice.add(Double.parseDouble(info[4]));
                lowPrice.add(Double.parseDouble(info[5]));
                lastPrice.add(Double.parseDouble(info[6]));
                closePrice.add(Double.parseDouble(info[7]));
                i++;
            }
        }

        System.out.println();

        //first finding the average price of the stock
        double avg = 0.0;
        for (Double cp : closePrice) {
            avg += cp;
        }
        double average = Math.floor(avg/closePrice.size()*100)/100;
        System.out.println("Average price of stock over 15 days: " + average);

        System.out.println();

        //calculating the maxDrawdown of the stock(daily closePrice is the one which is to be considered for the same)
        double maxx = closePrice.get(0);
        double difference = 0.0;
        double val = 0.0;
        for (double temp : closePrice) {
            if (temp >= maxx) {
                maxx = temp;
            } else {
                difference = maxx - temp;
                val = Math.max(difference, val);
            }
        }

        val = Math.floor((val*100))/100;
        System.out.println("Max Drawdown of the given stock: " + val);
        System.out.println();

        //calculating the max ReturnPotential of the stock using the given data(now: maxReturnPotential for a day will be openPrice-closePrice of that day)
        double maxPot = 0.0;
        for(int j=0;j<openPrice.size();j++){
            maxPot += Math.abs(openPrice.get(j)-closePrice.get(j));
        }
        maxPot = Math.floor(maxPot*100)/100;
        System.out.println("Max Return Potential for the stock over 15 days: " + maxPot);
        System.out.println();

        //calculating the maxReturnPotential percentage( {formula used: maxReturnPotential/openPrice on first day}*100)
        double percentage = Math.floor((100*maxPot)/openPrice.get(0)*100)/100;
        System.out.println("Percentage max Return Potential for the stock is: " + percentage +"%");

    }
    catch (Exception e){
        e.printStackTrace();
        System.out.println("Error!!");
    }
    }

}

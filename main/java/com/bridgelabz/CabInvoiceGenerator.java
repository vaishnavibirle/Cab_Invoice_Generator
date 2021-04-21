package com.bridgelabz;

public class CabInvoiceGenerator {

    //Created Constants
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final double MINIMUM_FARE = 5;

    public static void main(String[] args) {
        System.out.println("****WELCOME TO CAB INVOICE GENERATOR****");
    }

    //Calculated the total fare
    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        if (totalFare < MINIMUM_FARE)
            return MINIMUM_FARE;
        return totalFare;
    }

    //Calculating total fare for multiple rides
    public double calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.distance, ride.time);
        }
        System.out.println("Total Fare: "+totalFare);
        return totalFare;
    }
}


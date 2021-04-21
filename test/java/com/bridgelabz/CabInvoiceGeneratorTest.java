package com.bridgelabz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceGeneratorTest {

    //Calculating total Fare
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = cabInvoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(25,fare,0.0);
    }

    //Calculating Minimum Fare
    @Test
    public void givenDistanceAndTime_ShouldReturnMinFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double distance = 0.0;
        int time = 1;
        double fare = cabInvoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(5,fare,0.0);
        }
    }

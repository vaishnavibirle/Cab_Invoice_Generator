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
        double fare = cabInvoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(5, fare, 0.0);
    }

    //Taking multiple rides and calculating  total fare
    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        Ride[] rides = { new Ride(2.0,5),
                         new Ride(2.0,8),
                         new Ride(0.2,1),
                         new Ride(3.0,6)
                       };
        InvoiceSummary invoiceSummary = cabInvoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(4,94);
        Assertions.assertEquals(invoiceSummary,expectedInvoiceSummary);
    }
    // Given user ID should return invoice summary
    @Test
    public void givenUserId_ShouldReturnInvoiceSummary() {
        String userId="vaishnavi123";
        CabInvoiceGenerator generator = new CabInvoiceGenerator();
        Ride[] rides = { new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        generator.addRides(userId,rides);
        InvoiceSummary invoiceSummary=generator.getInvoiceSummary(userId);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30);
        Assertions.assertEquals(invoiceSummary, expectedInvoiceSummary);
    }
}

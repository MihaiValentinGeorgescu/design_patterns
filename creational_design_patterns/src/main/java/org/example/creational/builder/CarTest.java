package org.example.creational.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testCarConfiguration() {
        // Arrange: Build a car with specific configurations
        Car car = new Car.Builder()
                .setEngine("V6")
                .setTransmission("Automatic")
                .setInterior("Leather seats")
                .setColor("Blue")
                .setSunroof(true)
                .setGPS(true)
                .setSafetyPackage(true)
                .build();

        // Act & Assert: Check each field of the car
        assertNotNull(car, "The car object should be created.");
        assertTrue(car.toString().contains("V6"), "The engine should be set to V6.");
        assertTrue(car.toString().contains("Automatic"), "The transmission should be Automatic.");
        assertTrue(car.toString().contains("Leather seats"), "The interior should be Leather seats.");
        assertTrue(car.toString().contains("Blue"), "The color should be Blue.");
        assertTrue(car.toString().contains("Sunroof=true"), "The car should have a sunroof.");
        assertTrue(car.toString().contains("GPS=true"), "The car should have GPS.");
        assertTrue(car.toString().contains("SafetyPackage=true"), "The car should have a safety package.");

        // Print details (optional, useful for debugging)
        System.out.println("Car Test - Built car configuration: " + car);
    }
}

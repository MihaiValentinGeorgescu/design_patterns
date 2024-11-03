package org.example.creational;

import org.example.creational.builder.Car;
import org.example.creational.factory.Document;
import org.example.creational.factory.DocumentFactory;

import java.io.IOException;

public class CarManagementSystem {

    public static void main(String[] args) {
        // Step 1: Create a car configuration using the Builder pattern
        Car car = new Car.Builder()
                .setEngine("V8")
                .setTransmission("Automatic")
                .setInterior("Leather seats")
                .setColor("Red")
                .setSunroof(true)
                .setGPS(true)
                .setSafetyPackage(true)
                .build();

        // Step 2: Use the car's toString method to get the car description
        String carDescription = car.toString();

        // Step 3: Save the car description to different document formats
        saveDocument("PDF", carDescription);
        saveDocument("Word", carDescription);
        saveDocument("HTML", carDescription);
    }

    private static void saveDocument(String type, String content) {
        Document doc = DocumentFactory.createDocument(type);
        try {
            doc.save(content);
            System.out.println(type + " document saved successfully.");
        } catch (IOException e) {
            System.out.println("Failed to save " + type + " document: " + e.getMessage());
        }
    }
}

package org.example.creational;

import org.example.creational.builder.Car;

public class CarConfiguration {

    public static void main(String[] args) {
        Car car1 = new Car.Builder()
                .setEngine("V6")
                .setTransmission("Automatic")
                .setInterior("Leather seats")
                .setColor("Red")
                .setSunroof(true)
                .setGPS(true)
                .build();

        Car car2 = new Car.Builder()
                .setEngine("V8")
                .setTransmission("Manual")
                .setInterior("Standard")
                .setColor("Black")
                .setSafetyPackage(true)
                .build();

        System.out.println(car1);
        System.out.println(car2);
    }
}

package com.pluralsight.Car;

import com.pluralsight.Vehicle.Vehicle;

public class Car extends Vehicle {

    public Car(String typeOfVehicle, String make, String model, int passengerCount, int travelRange, int year, String VIN, int odometer, boolean isElectric, String color, int cargoCapacity, int fuelCapacity, int safetyRating, int numberOfDoors, String carType) {
        super(typeOfVehicle, make, model, passengerCount, travelRange, year, VIN, odometer, isElectric, color, cargoCapacity, fuelCapacity);
    }
}
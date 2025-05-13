package com.pluralsight.Semi;

import com.pluralsight.Vehicle.Vehicle;

public class Semi extends Vehicle {

    public Semi(String typeOfVehicle, String make, String model, int passengerCount, int travelRange, int year, String VIN, int odometer, boolean isElectric, String color, int cargoCapacity, int fuelCapacity, int numberOfTrailers, boolean isSleeperCabin) {
        super(typeOfVehicle, make, model, passengerCount, travelRange, year, VIN, odometer, isElectric, color, cargoCapacity, fuelCapacity);
    }
}
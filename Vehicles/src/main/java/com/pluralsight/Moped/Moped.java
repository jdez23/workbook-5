package com.pluralsight.Moped;

import com.pluralsight.Vehicle.Vehicle;

public class Moped extends Vehicle {
    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int currentSpeed, int acceleration, int brakingPower, int turningRadius, int weight, int maxSpeed) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, currentSpeed, acceleration, brakingPower, turningRadius, weight, maxSpeed);
    }
}
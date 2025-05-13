package com.pluralsight;

import com.pluralsight.Car.Car;
import com.pluralsight.HoverCraft.HoverCraft;
import com.pluralsight.Moped.Moped;
import com.pluralsight.Semi.Semi;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.setCargoCapacity(1);
        slowRide.setNumberOfPassengers(1);

        Car sedan = new Car();
        sedan.setColor("Blue");
        sedan.setFuelCapacity(15);
        sedan.setCargoCapacity(5);
        sedan.setNumberOfPassengers(5);

        Semi hauler = new Semi();
        hauler.setColor("Black");
        hauler.setFuelCapacity(50);
        hauler.setCargoCapacity(20000);
        hauler.setNumberOfPassengers(2);

        HoverCraft hover = new HoverCraft();
        hover.setColor("Silver");
        hover.setFuelCapacity(25);
        hover.setCargoCapacity(300);
        hover.setNumberOfPassengers(3);

        System.out.println("Test complete!");
    }
}
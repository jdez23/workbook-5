package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        // Add 2 houses
        assets.add(new House(
                "My primary home",
                "2020-06-15",
                240000,
                "123 Maple St",
                2,    // condition: good
                1800, // square feet
                5000  // lot size
        ));

        assets.add(new House(
                "Vacation cabin",
                "2018-07-10",
                180000,
                "456 Pine Ln",
                1,    // excellent
                1200,
                10000
        ));

        // Add 2 vehicles
        assets.add(new Vehicle(
                "Tom's truck",
                "2015-04-22",
                28000,
                "Ford F-150",
                2015,
                150000
        ));

        assets.add(new Vehicle(
                "My car",
                "2019-01-05",
                22000,
                "Toyota Camry",
                2019,
                85000
        ));

        // Loop through and display details
        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.printf("Original Cost: $%.2f\n", asset.getOriginalCost());
            System.out.printf("Estimated Value: $%.2f\n", asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset; // downcasting
                System.out.println("Address: " + house.address);
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset; // downcasting
                System.out.println("Year: " + vehicle.year);
                System.out.println("Make/Model: " + vehicle.makeModel);
            }

            System.out.println(); // empty line between assets
        }
    }
}


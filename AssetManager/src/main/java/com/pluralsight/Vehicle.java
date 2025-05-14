package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {
    protected String makeModel;
    protected int year;
    protected int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost,
                   String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;
        double value = getOriginalCost();

        if (age > 10) {
            value = 1000;
        } else {
            double reductionRate;
            if (age <= 3) {
                reductionRate = 0.03;
            } else if (age <= 6) {
                reductionRate = 0.06;
            } else {
                reductionRate = 0.08;
            }
            value = value - (value * reductionRate * age);
        }

        if (odometer > 100_000 &&
                !(makeModel.toLowerCase().contains("honda") || makeModel.toLowerCase().contains("toyota"))) {
            value *= 0.75;
        }

        return value;
    }

    // Getters and setters (optional for now)
}

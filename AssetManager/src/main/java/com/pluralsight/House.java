package com.pluralsight;

public class House extends Asset {
    protected String address;
    protected int condition; // 1 = excellent, 2 = good, 3 = fair, 4 = poor
    protected int squareFoot;
    protected int lotSize;

    public House(String description, String dateAcquired, double originalCost,
                 String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double basePricePerSqFt;
        switch (condition) {
            case 1: basePricePerSqFt = 180; break; // excellent
            case 2: basePricePerSqFt = 130; break; // good
            case 3: basePricePerSqFt = 90; break;  // fair
            case 4: basePricePerSqFt = 80; break;  // poor
            default: basePricePerSqFt = 0;
        }

        return (squareFoot * basePricePerSqFt) + (lotSize * 0.25);
    }

    // Getters and setters (optional for now)
}

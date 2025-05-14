package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Blue", 5, 300, 20);
        Moped myMoped = new Moped("Red", 1, 50, 2);
        SemiTruck myTruck = new SemiTruck("Black", 2, 5000, 60);
        Hovercraft myHovercraft = new Hovercraft("White", 3, 150, 30);

        System.out.println("Created with constructors.");
    }
}

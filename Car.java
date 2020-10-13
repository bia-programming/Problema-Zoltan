package com.company;

public class Car extends Vehicle {
    boolean isLeather;
    int seats;

    public Car(int id, int doors, boolean windShiled, int wheels,boolean isLeather, int seats) {
        super(id, doors, windShiled, wheels);
        this.isLeather=isLeather;
        this.seats=seats;
    }
}

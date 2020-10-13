package com.company;

public class Car extends Vehicle {
    private boolean isLeather;
    private int seats;

    public Car(int id, int doors, boolean windShiled, int wheels,boolean isLeather, int seats) {
        super(id, doors, windShiled, wheels);
        this.isLeather=isLeather;
        this.seats=seats;
    }

    public boolean isLeather() {
        return isLeather;
    }

    public void setLeather(boolean leather) {
        isLeather = leather;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}

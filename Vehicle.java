package com.company;

public class Vehicle {
    private int id;
    private int doors;
    private boolean windShiled;
    private int wheels;

    public Vehicle(int id, int doors, boolean windShiled, int wheels) {
        this.id = id;
        this.doors = doors;
        this.windShiled = windShiled;
        this.wheels = wheels;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isWindShiled() {
        return windShiled;
    }

    public void setWindShiled(boolean windShiled) {
        this.windShiled = windShiled;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", doors=" + doors +
                ", windShiled=" + windShiled +
                ", wheels=" + wheels +
                '}';
    }
}

package com.company;

public class Suv extends Vehicle {
    String suspensionType;
    boolean hasRemovableRoof;

    public Suv(int id, int doors, boolean windShiled, int wheels, String suspensionType, boolean hasRemovableRoof) {
        super(id, doors, windShiled, wheels);
        this.hasRemovableRoof=hasRemovableRoof;
        this.suspensionType=suspensionType;
    }
}

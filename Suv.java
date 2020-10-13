package com.company;

public class Suv extends Vehicle {
    private String suspensionType;
    private boolean hasRemovableRoof;

    public Suv(int id, int doors, boolean windShiled, int wheels, String suspensionType, boolean hasRemovableRoof) {
        super(id, doors, windShiled, wheels);
        this.hasRemovableRoof=hasRemovableRoof;
        this.suspensionType=suspensionType;
    }

    public String getSuspensionType() {
        return suspensionType;
    }

    public void setSuspensionType(String suspensionType) {
        this.suspensionType = suspensionType;
    }

    public boolean isHasRemovableRoof() {
        return hasRemovableRoof;
    }

    public void setHasRemovableRoof(boolean hasRemovableRoof) {
        this.hasRemovableRoof = hasRemovableRoof;
    }
}

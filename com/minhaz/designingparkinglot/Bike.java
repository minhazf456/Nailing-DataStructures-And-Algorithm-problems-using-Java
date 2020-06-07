package com.minhaz.designingparkinglot;

public class Bike implements Vehicle {
    private VehicleType type;

    public Bike(VehicleType type) {
        this.type = type;
    }

    public VehicleSize getSize() {
        return VehicleSize.SMALL;
    }

    public VehicleType getType() {
        return type;
    }
}

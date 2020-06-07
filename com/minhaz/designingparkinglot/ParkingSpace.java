package com.minhaz.designingparkinglot;

public class ParkingSpace implements Space {
    private VehicleSize vehicleSize;
    private VehicleType type;
    private boolean isTaken;

    public ParkingSpace(VehicleSize vehicleSize, VehicleType type) {
        this.vehicleSize = vehicleSize;
        this.type = type;
    }

    public VehicleSize getSize() {
        return this.vehicleSize;
    }

    public VehicleType getType() {
        return this.type;
    }

    public boolean getIsTaken() {
        return this.isTaken;
    }

    public void setIsTaken(boolean isTaken) {
        this.isTaken = isTaken;
    }

}
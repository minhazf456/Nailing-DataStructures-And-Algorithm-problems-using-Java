package DesignParkingLot.minhaz.designingparkinglot;

public class Truck implements Vehicle {

    VehicleType type;

    public Truck(VehicleType type) {
        this.type = type;
    }

    public VehicleSize getSize() {
        return VehicleSize.LARGE;
    }

    public VehicleType getType() {
        return this.type;
    }

}
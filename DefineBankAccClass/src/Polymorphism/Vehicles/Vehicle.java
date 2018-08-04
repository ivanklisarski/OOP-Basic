package Polymorphism.Vehicles;

public abstract class  Vehicle {


    private double fuelQuantity;
    private double fuelConsumPerKm;

    protected Vehicle(double fuelQuantity, double fuelConsumPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumPerKm = fuelConsumPerKm;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumPerKm() {
        return fuelConsumPerKm;
    }

    protected void setFuelConsumPerKm(double fuelConsumPerKm) {
        this.fuelConsumPerKm = fuelConsumPerKm;
    }

    public abstract void refuel(double fuel);

    public abstract void drive(double distance);
}

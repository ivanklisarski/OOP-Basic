package Polymorphism.Vehicles;

public class Truck extends Vehicle {
    private static final double AIR_CONDITIONER_EXTRA_CONSUMPTION = 1.6;
    private static final double REFUEL_EFFICIENCY = 0.95;


    public Truck(double fuelQuantity, double fuelConsumPerKm) {
        super(fuelQuantity, fuelConsumPerKm + AIR_CONDITIONER_EXTRA_CONSUMPTION);
    }

    @Override
    public void refuel(double fuel) {
        super.setFuelQuantity(super.getFuelQuantity() + fuel * REFUEL_EFFICIENCY);

    }

    @Override
    public void drive(double distance) {
        double fuelNeeded = super.getFuelConsumPerKm() * distance;
        if (fuelNeeded > super.getFuelQuantity()) {
            throw new IllegalArgumentException("Truck needs refueling");
        }
        super.setFuelQuantity(super.getFuelQuantity() - fuelNeeded);

    }
}

package Polymorphism.Vehicles_Mod;

public class Bus extends Vehicle{
    private static final double AIR_CONDITIONER_EXTRA_CONSUMPTION = 1.4;

    public Bus(double fuelQuantity, double fuelConsumPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumPerKm, tankCapacity);
    }

    @Override
    public String getName() {
        return "Bus";
    }

    @Override
    protected double getFuelConsumptionModifier(boolean isSpecial) {
         return isSpecial ? AIR_CONDITIONER_EXTRA_CONSUMPTION : 1.0;

    }
}

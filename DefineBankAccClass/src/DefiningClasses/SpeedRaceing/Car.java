package DefiningClasses.SpeedRaceing;


public class Car {
    private static final int DEFAULT_DISTANCE_TRAVELED = 0;
    //model, fuel amount, fuel cost for 1 kilometer and distance traveled

    private String model;
    private double fuel;
    private double costPerKm;
    private int distanceTraveled;

    public Car(String model, double fuel, double fuelCost) {
        this.model = model;
        this.fuel = fuel;
        this.costPerKm = fuelCost;
        this.distanceTraveled = DEFAULT_DISTANCE_TRAVELED;
    }

    public void drive(int kilometers) {

        double fuelForDrive = kilometers * this.costPerKm;

        if (fuelForDrive > this.fuel) {
            throw new IllegalStateException("Insufficient fuel for the drive");
        }

        this.distanceTraveled += kilometers;
        this.fuel -= fuelForDrive;

    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuel, this.distanceTraveled);
    }
}

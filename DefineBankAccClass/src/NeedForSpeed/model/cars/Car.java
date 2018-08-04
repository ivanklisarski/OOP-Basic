package NeedForSpeed.model.cars;

public abstract class Car {
   private String brand;
   private String model;
   private int yearOfProduction;
   private int horsepower;
   private int acceleration;
   private int suspension;
   private int durability;

    public Car(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.horsepower = horsepower;
        this.acceleration = acceleration;
        this.suspension = suspension;
        this.durability = durability;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getSuspension() {
        return suspension;
    }

    public void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getEnginePerformancePoints() {
        return this.horsepower / this.acceleration;
    }

    public int getSuspensionPerformancePoints() {
        return this.suspension + this.durability;
    }

    public int getOverallPerformancePoints() {
        return this.getEnginePerformancePoints() + this.getSuspensionPerformancePoints();
    }

    @Override
    public String toString() {
        StringBuilder car = new StringBuilder();

        car
                .append(String.format("%s %s %d",
                        this.brand,
                        this.model,
                        this.yearOfProduction))
                .append(System.lineSeparator())
                .append(String.format("%d HP, 100 m/h in %d s",
                        this.horsepower,
                        this.acceleration))
                .append(System.lineSeparator())
                .append(String.format("%d Suspension force, %d Durability",
                        this.suspension,
                        this.durability))
                .append(System.lineSeparator());

        return car.toString();
    }
}

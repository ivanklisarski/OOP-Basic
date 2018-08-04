package NeedForSpeed.model.cars;

public class ShowCar extends Car {

    private int stats;

    public ShowCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        this.stats = 0;
    }

    public int getStats() {
        return stats;
    }

    public void setStats(int stats) {
        this.stats = stats;
    }

    @Override
    public String toString() {
        StringBuilder showCar = new StringBuilder(super.toString());

        showCar
                .append(String.format("%d *", this.stats));

        return showCar.toString();
    }
}

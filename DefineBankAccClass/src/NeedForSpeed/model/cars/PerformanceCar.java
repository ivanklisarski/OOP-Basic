package NeedForSpeed.model.cars;

import java.util.ArrayList;
import java.util.List;

public class PerformanceCar extends Car {

    private List<String> addOns;
    private int Increases;
    private int Decreases ;

    public PerformanceCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        this.addOns = new ArrayList<String>();

    }

    @Override
    public String toString() {
        StringBuilder performanceCar = new StringBuilder(super.toString());

        String addOns = this.addOns.size() == 0 ? "None" : String.join(", ", this.addOns);

        performanceCar
                .append(String.format("Add-ons: %s", addOns));

        return performanceCar.toString();
    }

}

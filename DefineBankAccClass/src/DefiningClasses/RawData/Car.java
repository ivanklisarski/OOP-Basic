package DefiningClasses.RawData;


import java.util.ArrayList;
import java.util.List;

public class Car {
    //model, engine, cargo and a collection of exactly 4 tires
   // private static final int TIRES_COUNT = 4;

 private String model;
 private Engine engine;
 private Cargo cargo;
 private List<Tire> tires;

    public Car(String model, Engine engine, Cargo cargo, List<Tire> tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public Car(String model,
               int engineSpeed, int enginePower,
               String cargoType, int cargoWeight,
               double[] tiresPressure, int[] tireAge) {
        this.model = model;
        this.engine = new Engine(engineSpeed, enginePower);
        this.cargo = new Cargo(cargoWeight,cargoType);
        this.tires = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            this.tires.add(new Tire(tireAge[i], tiresPressure[i]));
        }
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public void setTires(List<Tire> tires) {
        this.tires = tires;
    }

    @Override
    public String toString() {
        return String.format("%s", this.getModel());
    }
}

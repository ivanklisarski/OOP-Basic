package NeedForSpeed.model.controller;

import NeedForSpeed.model.Garage;
import NeedForSpeed.model.cars.Car;
import NeedForSpeed.model.factories.CarFactory;
import NeedForSpeed.model.factories.RaceFactory;
import NeedForSpeed.model.races.Race;

import java.util.LinkedHashMap;
import java.util.Map;

public class CarManager {
    private Map<Integer, Car> cars;
    private Map<Integer, Race> races;

    private Garage garage;

    public CarManager() {
        this.cars = new LinkedHashMap<Integer, Car>();
        this.races = new LinkedHashMap<Integer, Race>();
        this.garage = new Garage();
    }
    public void register(int id, String type, String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        Car newCar = this.makeCar(type, brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);

        this.cars.put(id, newCar);
    }

    public String check(int id) {
        Car foundCar = this.cars.get(id);

        return foundCar.toString();
    }

    public void open(int id, String type, int length, String route, int prizePool) {
        Race newRace = this.makeRace(type, length, route, prizePool);

        this.races.put(id, newRace);
    }

    public void open(int id, String type, int length, String route, int prizePool, int specialRaceParameter) {
        Race newRace = this.makeRace(type, length, route, prizePool);

        this.races.put(id, newRace);
    }
    private Car makeCar(String type, String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        Car resultCar = null;

        switch (type) {
            case "Performance":
                resultCar = CarFactory.makePerformanceCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
                break;
            case "Show":
                resultCar = CarFactory.makeShowCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
                break;
        }

        return resultCar;
    }

    private Race makeRace(String type, int length, String route, int prizePool) {
        Race resultRace = null;

        switch (type) {
            case "Casual":
                resultRace = RaceFactory.makeCasualRace(length, route, prizePool);
                break;
            case "Drag":
                resultRace = RaceFactory.makeDragRace(length, route, prizePool);
                break;
            case "Drift":
                resultRace = RaceFactory.makeDriftRace(length, route, prizePool);
                break;
        }

        return resultRace;
    }


}

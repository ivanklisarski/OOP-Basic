package NeedForSpeed.model.races;

import NeedForSpeed.model.cars.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Race {

    private int length;
    private String route;
    private int prizePool;
    private List<Car> participants;

    public Race(int length, String route, int prizePool) {
        this.length = length;
        this.route = route;
        this.prizePool = prizePool;
        this.participants = new ArrayList<>();
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getPrizePool() {
        return prizePool;
    }

    public void setPrizePool(int prizePool) {
        this.prizePool = prizePool;
    }

    public List<Car> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Car> participants) {
        this.participants = participants;
    }

    private int performancePoints(String raceType, Car car) {
        switch (raceType) {
            case "CasualRace":
                return car.getOverallPerformancePoints();
            case "DragRace":
                return car.getEnginePerformancePoints();
            case "DriftRace":
                return car.getSuspensionPerformancePoints();
        }

        return 0;
    }

    private List<Car> getWinners() {
        return this.participants
                .stream()
                .sorted((car1, car2) -> {
                    String raceType = this.getClass().getSimpleName();
                    return this.performancePoints(raceType, car2) - this.performancePoints(raceType, car1);
                })
                .limit(3)
                .collect(Collectors.toList());
    }

    private int getPercentagePriceValue(int index) {
        switch (index) {
            case 0:
                return 50;
            case 1:
                return 30;
            case 2:
                return 20;
        }
        return 0;
    }

    @Override
    public String toString() {
        String raceType = this.getClass().getSimpleName();
        Collection<Car> winners = this.getWinners();

        StringBuilder race = new StringBuilder();

        race
                .append(String.format("%s - %s", this.route, this.length));

        for (int i = 0; i < winners.size(); i++) {
            Car winner = ((List<Car>) winners).get(i);
            int moneyWon = (this.prizePool * this.getPercentagePriceValue(i)) / 100;
            race
                    .append(System.lineSeparator())
                    .append(
                            String.format("%d. %s %s %dPP - $%d",
                                    i + 1,
                                    winner.getBrand(),
                                    winner.getModel(),
                                    this.performancePoints(raceType, winner),
                                    moneyWon));
        }

        return race.toString();
    }
}

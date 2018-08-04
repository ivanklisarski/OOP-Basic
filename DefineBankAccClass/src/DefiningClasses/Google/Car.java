package DefiningClasses.Google;

public class Car {
    private String carName;
    private int carSpeed;

    public Car(String carName, int carSpeed) {
        this.carName = carName;
        this.carSpeed = carSpeed;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        return String.format("%s %d",this.carName,this.carSpeed);
    }
}

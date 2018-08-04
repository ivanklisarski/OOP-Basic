package DefiningClasses.RawData;

public class Tire {


  private   int tireAge;
  private   double tirePresure;

    public Tire() {
    }

    public Tire(int tireAge, double tirePresure) {
        this.tireAge = tireAge;
        this.tirePresure = tirePresure;
    }

    public int getTireAge() {
        return tireAge;
    }

    public void setTireAge(int tireAge) {
        this.tireAge = tireAge;
    }

    public double getTirePresure() {
        return tirePresure;
    }

    public void setTirePresure(double tirePresure) {
        this.tirePresure = tirePresure;
    }
}

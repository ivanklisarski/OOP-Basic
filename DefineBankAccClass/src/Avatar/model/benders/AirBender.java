package Avatar.model.benders;

public class AirBender extends Bender {
    private double 	aerialIntegirty;
    public AirBender(String name, int power,double aerialIntegirty) {
        super(name, power);
        this.aerialIntegirty = aerialIntegirty;
    }

    public double getAerialIntegirty() {
        return aerialIntegirty;
    }

    public void setAerialIntegirty(double aerialIntegirty) {
        this.aerialIntegirty = aerialIntegirty;
    }
    @Override
    public String toString() {
        return String.format("###Air Bender: %s, Power: %d, Aerial Integrity: %.2f",
                super.getName(), super.getPower(), this.aerialIntegirty);
    }

    @Override
    public double getTotalPower() {
        return super.getPower()*this.aerialIntegirty;
    }
}

package Avatar.model.monuments;

public class AirMonument extends Monument {
    private Integer airAffinity;

    public AirMonument(String name,Integer airAffinity) {
        super(name);
        this.airAffinity = airAffinity;
    }

    public Integer getAirAffinity() {
        return airAffinity;
    }

    public void setAirAffinity(Integer airAffinity) {
        this.airAffinity = airAffinity;
    }

    @Override
    public String toString() {
        return String.format("###Air Monument: %s, Air Affinity: %d",
                super.getName(), this.airAffinity);
    }

    @Override
    public int getPower() {
        return this.airAffinity;
    }
}

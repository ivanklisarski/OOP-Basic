package Avatar.model.monuments;

public class WaterMonument extends Monument {
    private Integer waterAffinity;
    public WaterMonument(String name,Integer waterAffinity) {
        super(name);
        this.waterAffinity = waterAffinity;
    }

    public Integer getWaterAffinity() {
        return waterAffinity;
    }

    public void setWaterAffinity(Integer waterAffinity) {
        this.waterAffinity = waterAffinity;
    }
    @Override
    public String toString() {
        return String.format("###Water Monument: %s, Water Affinity: %d",
                super.getName(), this.waterAffinity);
    }
    @Override
    public int getPower() {
        return this.waterAffinity;
    }
}

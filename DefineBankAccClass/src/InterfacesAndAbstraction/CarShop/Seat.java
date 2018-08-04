package InterfacesAndAbstraction.CarShop;

import java.io.Serializable;

public class Seat implements Car,Serializable{
    private String countryProduced;
    private String model;
    private String color;
    private Integer horsePower;

    public Seat(String countryProduced, String model,Integer horsePower, String color) {
        this.countryProduced = countryProduced;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getCountryProduced() {
        return countryProduced;
    }

    public void setCountryProduced(String countryProduced) {
        this.countryProduced = countryProduced;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
       sb.append(String.format("%s is %s and have %s horse powers",this.getModel(),this.getColor(),this.getHorsePower()))
               .append(System.lineSeparator()).append(String.format("This is %s produced in %s and have %d tires",this.getModel(),this.countryProduced,TIRES));
        return sb.toString();

    }
}

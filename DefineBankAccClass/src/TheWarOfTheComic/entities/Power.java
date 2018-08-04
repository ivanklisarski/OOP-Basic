package TheWarOfTheComic.entities;

import TheWarOfTheComic.contracts.SuperPower;

import java.util.regex.Pattern;

public class Power implements SuperPower{
    private String name;
    private double 	powerPoints;

    public Power(String name, double powerPoints) {
        this.name = name;
        this.powerPoints = powerPoints;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(!hasValidName(name) || name.length() < 5)
        {
            throw  new IllegalArgumentException("Super power name not in the correct format!");
        }
        this.name = name;
    }


    public double getPowerPoints() {
        return ( powerPoints+ name.length())/2;
    }

    private void setPowerPoints(double powerPoints) {
        if(powerPoints < 0){
            throw  new IllegalArgumentException("Power points should be a possitive number!");
        }
        this.powerPoints = powerPoints;
    }

    private boolean hasValidName(String name) {
        return Pattern.compile("^@[A-Za-z_]+@")
                .matcher(name)
                .matches();
    }

    @Override
    public String toString() {
        return String.format("%s added to pool!",this.name);
    }
}

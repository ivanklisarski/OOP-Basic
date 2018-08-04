package TheWarOfTheComic.entities;

import TheWarOfTheComic.contracts.ComicCharacter;
import TheWarOfTheComic.contracts.SuperPower;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public abstract class ComicCharacterImpl implements ComicCharacter {

    private String name;
    private int energy;
    private double health;
    private double intelligence;
    private List<SuperPower> powers;

    public ComicCharacterImpl(String name, int energy, double health, double intelligence) {
        this.setName(name);
        this.setEnergy(energy);
        this.setHealth(health);
        this.setIntelligence(intelligence);
        this.powers = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.length() < 2 || name.length() > 12 || !hasValidName(name)) {
            throw new IllegalArgumentException("Comic Character name is not in the correct format!");
        }
        this.name = name;
    }

    private boolean hasValidName(String name) {
        return Pattern.compile("[A-Za-z_]+")
                .matcher(name)
                .matches();
    }

    private void setEnergy(int energy) {
        if (energy < 0 || energy > 300) {
            throw new IllegalArgumentException("Energy is not in the correct range!");
        }
        this.energy = energy;
    }

    private void setHealth(double health) {
        if (health < 0) {
            throw new IllegalArgumentException("Health should be a possitive number!");
        }
        this.health = health;
    }

    private void setIntelligence(double intelligence) {
        if (intelligence < 0 || intelligence > 200) {
            throw new IllegalArgumentException("Intelligence is not in the correct range!");
        }
        this.intelligence = intelligence;
    }

    public List<SuperPower> getPowers() {
        return powers;
    }

    public void setPowers(List<SuperPower> powers) {
        this.powers = powers;
    }

    @Override
    public void takeDamage(double damage) {

    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void boostCharacter(int energy, double health, double intelligence) {

    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public double getHealth() {
        return health;
    }

    @Override
    public double getIntelligence() {
        return intelligence;
    }

    @Override
    public double attack() {
        return 0;
    }

    @Override
    public double getSpecial() {
        return 0;
    }

    @Override
    public String useSuperPowers() {
        return null;
    }

    @Override
    public void addSuperPower(SuperPower superPower) {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.
                append(String.format("#Name: %s",this.getName()))
                .append(System.lineSeparator())
                .append(String.format("##Health: %.2f// Energy: %d// Intelligence: %.2f",getHealth(),getEnergy(),getIntelligence()));

        return sb.toString();
    }
}

package TheWarOfTheComic.entities.Hero;

import TheWarOfTheComic.entities.ComicCharacterImpl;

public abstract class AntiHero extends ComicCharacterImpl {

    private double evilness;

    public AntiHero(String name, int energy, double health, double intelligence,double evilness) {
        super(name, energy, health, intelligence);
        this.setEvilness(evilness);
    }

    private void setEvilness(double evilness) {
        if(evilness < 0 ){
            throw new IllegalArgumentException("Evilness should be a possitive number!");
        }
        this.evilness = evilness;
    }

    public double getEvilness() {
        return evilness;
    }

    @Override
    public String toString() {
        return String.format("###Evilness: %.2f",getEvilness());
    }
}

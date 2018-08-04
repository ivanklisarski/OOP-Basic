package TheWarOfTheComic.entities.Hero;

import TheWarOfTheComic.entities.ComicCharacterImpl;

public abstract class  Hero extends ComicCharacterImpl {

    private double heroism;

    public Hero(String name, int energy, double health, double intelligence,double heroism) {
        super(name, energy, health, intelligence);
        this.setHeroism(heroism);
    }

    private void setHeroism(double heroism) {
        if(heroism <  0){
            throw new IllegalArgumentException("Heroism should be a possitive number!");
        }
        this.heroism = heroism;
    }

    public double getHeroism() {
        return heroism;
    }

    @Override
    public String toString() {
        return String.format("###Heroism: %.2f",getHeroism());
    }
}

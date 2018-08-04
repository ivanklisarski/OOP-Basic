package TheWarOfTheComic.entities.Hero;

public class MarvelHero extends Hero {
    public MarvelHero(String name, int energy, double health, double intelligence, double heroism) {
        super(name, energy, health, intelligence, heroism);
    }
    public double attack(){
        return ((getEnergy()+getSpecial())*getIntelligence())/2.5;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.
                //append(String.format("#Name: %s",super.getName()))
                //.append(System.lineSeparator())
                //.append(String.format("##Health: %.2f// Energy: %d// Intelligence: %.2f",getHealth(),getEnergy(),getIntelligence()))
                //.append(System.lineSeparator())
                //.append(String.format("###Heroism: %.2f",getHeroism()))
                //.append(System.lineSeparator())
                append(String.format("####Marvel Power: %.2f",this.attack()));

        return sb.toString();
    }
}

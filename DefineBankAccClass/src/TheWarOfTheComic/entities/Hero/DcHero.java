package TheWarOfTheComic.entities.Hero;

public class DcHero extends Hero {
    public DcHero(String name, int energy, double health, double intelligence, double heroism) {
        super(name, energy, health, intelligence, heroism);
    }
    public double attack(){
        return (getEnergy()/1.5)+getSpecial()+getIntelligence();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.
                //append(String.format("#Name: %s",super.getName()))
                //.append(System.lineSeparator())
                //.append(String.format("##Health: %d// Energy: %d// Intelligence: %d",getHealth(),getEnergy(),getIntelligence()))
                //.append(System.lineSeparator())
                //.append(String.format("###Heroism: %d",getHeroism()))
                //.append(System.lineSeparator())
                append(String.format("####DC Attack Power: %.2f",this.attack()));

        return sb.toString();
    }
}

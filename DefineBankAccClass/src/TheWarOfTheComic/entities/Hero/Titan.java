package TheWarOfTheComic.entities.Hero;

public class Titan extends AntiHero {
    public Titan(String name, int energy, double health, double intelligence, double evilness) {
        super(name, energy, health, intelligence, evilness);
    }
    public double attack(){
        return (getIntelligence()+getSpecial()+getEnergy())*3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.
               // append(String.format("#Name: %s",super.getName()))
               // .append(System.lineSeparator())
               // .append(String.format("##Health: %d// Energy: %d// Intelligence: %d",getHealth(),getEnergy(),getIntelligence()))
               // .append(System.lineSeparator())
               // .append(String.format("###Evilness: %d",getEvilness()))
               // .append(System.lineSeparator())
                append(String.format("####Titan Attack Power: %.2f",this.attack()));

        return sb.toString();
    }
}

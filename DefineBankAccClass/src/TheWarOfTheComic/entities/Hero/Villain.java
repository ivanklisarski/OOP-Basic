package TheWarOfTheComic.entities.Hero;

public class Villain extends AntiHero{
    public Villain(String name, int energy, double health, double intelligence, double evilness) {
        super(name, energy, health, intelligence, evilness);
    }
    public double attack(){

        return (getIntelligence() * getSpecial())/getEnergy();
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();

       sb.
               //append(String.format("#Name: %s",super.getName()))
               //.append(System.lineSeparator())
               //.append(String.format("##Health: %.2f// Energy: %d// Intelligence: %.2f",getHealth(),getEnergy(),getIntelligence()))
               //.append(System.lineSeparator())
               //.append(String.format("###Evilness: %.2f",getEvilness()))
               //.append(System.lineSeparator())
               append(String.format("####Villain Attack Power: %.2f",this.attack()));

       return sb.toString();
    }
}

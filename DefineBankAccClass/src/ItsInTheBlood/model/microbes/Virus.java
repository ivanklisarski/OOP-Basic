package ItsInTheBlood.model.microbes;

import ItsInTheBlood.model.Microbe;

public class Virus extends Microbe {

    public Virus(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol, virulence);
    }


    @Override
    protected int getEnergy() {
        return super.getHealth() + super.getVirulence();

    }
}

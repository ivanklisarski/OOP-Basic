package ItsInTheBlood.model.microbes;

import ItsInTheBlood.model.Microbe;

public class Fungi extends Microbe {


    public Fungi(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol, virulence);
    }


    @Override
    protected int getEnergy() {
        return (super.getHealth() + super.getVirulence()) / 4;

    }
}

package ItsInTheBlood.model.bloodCell;

import ItsInTheBlood.model.BloodCell;

public class WhiteBloodCell extends BloodCell {
    private int size;
    public WhiteBloodCell(String id, int health, int positionRow, int positionCol,int size) {
        super(id, health, positionRow, positionCol);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("%s%n--------Health: %d | Size: %d | Energy: %d",
                super.toString(), super.getHealth(), this.size, this.getEnergy());
    }

    @Override
    protected int getEnergy() {
        return (super.getHealth() + this.size) * 2;
    }
}

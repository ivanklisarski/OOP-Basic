package ItsInTheBlood.model.bloodCell;

import ItsInTheBlood.model.BloodCell;

public class RedBloodCell extends BloodCell {
    private int velocity;
    public RedBloodCell(String id, int health, int positionRow, int positionCol,int velocity) {
        super(id, health, positionRow, positionCol);
        this.velocity = velocity;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return String.format("%s%n--------Health: %d | Velocity: %d | Energy: %d",
                super.toString(), super.getHealth(), this.velocity, this.getEnergy());
    }

    @Override
    protected int getEnergy() {
        return super.getHealth() + this.velocity;
    }
}

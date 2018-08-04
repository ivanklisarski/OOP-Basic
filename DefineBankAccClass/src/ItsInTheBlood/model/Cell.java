package ItsInTheBlood.model;

public  abstract class Cell implements Comparable<Cell> {
    private String id;
    private int health;
    private int positionRow;
    private int positionCol;

    public Cell(String id, int health, int positionRow, int positionCol) {
        this.id = id;
        this.health = health;
        this.positionRow = positionRow;
        this.positionCol = positionCol;
    }
    @Override
    public String toString() {
        return String.format("------Cell %s [%d,%d]",
                this.id, this.positionRow, this.positionCol);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPositionRow() {
        return positionRow;
    }

    public void setPositionRow(int positionRow) {
        this.positionRow = positionRow;
    }

    public int getPositionCol() {
        return positionCol;
    }

    public void setPositionCol(int positionCol) {
        this.positionCol = positionCol;
    }


    void addHealth(int health) {
        this.health += health;
    }

    protected abstract int getEnergy();


    public abstract Cell fight(Cell other);

    @Override
    public int compareTo(Cell o) {
        int cmp = Integer.compare(this.positionRow, o.positionCol);
        if (cmp == 0) {

            return Integer.compare(this.positionCol, o.positionCol);
        }
        return cmp;
    }
}

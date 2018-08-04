package ItsInTheBlood.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cluster {
    private String id;
    private int rows;
    private int cols;
    private List<Cell> cells;

    public Cluster(String id, int rows, int cols) {
        this.id = id;
        this.rows = rows;
        this.cols = cols;
        this.cells = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public List<Cell> getCells() {
        return cells;
    }

    public boolean addCell(Cell cell) {
        if (cell.getPositionCol() > this.cols || cell.getPositionRow() > this.rows) {
            return false;
        }
        this.cells.add(cell);
        return true;
    }
    public int getCellsCount() {
        return this.cells.size();
    }
    public void activate() {
        if (this.cells.size() > 1) {
            this.cells.sort(Comparator.naturalOrder());

            Cell actor = this.cells.get(0);

            for (int i = 1; i < this.cells.size(); i++) {
                actor = actor.fight(this.cells.get(i));
            }

            this.cells.clear();
            this.cells.add(actor);
        }
    }
    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----Cluster ").append(this.id).append(System.lineSeparator());
        this.cells.sort(Comparator.naturalOrder());
        for (Cell cell : this.cells) {
            sb.append(cell).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}

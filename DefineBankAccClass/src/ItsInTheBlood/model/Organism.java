package ItsInTheBlood.model;

import java.util.LinkedList;
import java.util.List;

public class Organism {
    private String name;
    private List<Cluster> clusters;

    public Organism(String name) {
        this.name = name;
        this.clusters = new LinkedList<>();
    }
    public boolean addCluster(Cluster cluster) {
        for (Cluster current : clusters) {
            if (current.getId().equals(cluster.getId())) {
                return false;
            }
        }
        clusters.add(cluster);
        return true;
    }
    public Cluster getClusterById(String id) {
        for (Cluster current : clusters) {
            if (current.getId().equals(id)) {
                return current;
            }
        }
        return null;
    }
    public Cluster getNextCluster() {
        if (this.clusters.isEmpty()) {
            return null;
        }
        Cluster cluster = clusters.remove(0);
        clusters.add(cluster);
        return cluster;
    }
    private int getCellsCount() {
        int count = 0;
        for (Cluster cluster : clusters) {
            count += cluster.getCellsCount();
        }
        return count;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Organism - ").append(this.name).append(System.lineSeparator());
        sb.append("--Clusters: ").append(this.clusters.size()).append(System.lineSeparator());
        sb.append("--Cells: ").append(this.getCellsCount()).append(System.lineSeparator());
        for (Cluster cluster : clusters) {
            sb.append(cluster).append(System.lineSeparator());
        }
        return sb.toString();
    }
}

package Encapsulation.FootballTeamGenaerator;


import java.util.HashMap;
import java.util.Map;

public class Team {
    private String name;
    private double rating;
    private Map<String,Player> players;

    public Team(String name) {
        this.setName(name);
        this.rating = 0.0;
        this.players = new HashMap<>();
    }

    private void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        if(this.players.size() != 0){
            this.rating += this.players.values().stream().mapToDouble(Player::StatAvg).average().getAsDouble();
        }
       return this.rating;
    }

    public void AddPlayer(Player player){
        this.players.putIfAbsent(player.getName(),player);
    }

    public void RemovePlayer(String playerName){
        if(!this.players.containsKey(playerName)){
            throw  new  IllegalArgumentException(String.format("Player %s is not in %s team.",playerName,this.name));

        }

        this.players.remove(playerName);
    }
}

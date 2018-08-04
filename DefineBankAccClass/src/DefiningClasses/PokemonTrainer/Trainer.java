package DefiningClasses.PokemonTrainer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Trainer {
    private static final int DEFAULT_BADGES = 0;


    private String name;
    private int numberOfBadges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.numberOfBadges = DEFAULT_BADGES;
        this.pokemons = new LinkedList<>();
    }
    public void loseHealth() {

        Iterator<Pokemon> it = pokemons.iterator();
        while (it.hasNext()) {
            Pokemon pokemon = it.next();
            pokemon.setHealth(pokemon.getHealth() - 10);


            if (pokemon.getHealth() <= 0)
                it.remove();
        }


        }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

}

package TheWarOfTheComic.entities;

import TheWarOfTheComic.contracts.Arena;
import TheWarOfTheComic.contracts.ComicCharacter;
import TheWarOfTheComic.entities.Hero.AntiHero;
import TheWarOfTheComic.entities.Hero.Hero;

import java.util.List;

public class ArenaImpl implements Arena {

    private String arenaName;
    private List<Hero> heroes;
    private List<AntiHero> antiHeroes;
    private int capacity;

    public ArenaImpl(String arenaName, int capacity) {
        this.arenaName = arenaName;
        this.capacity = capacity;
    }

    @Override
    public String getArenaName() {
        return arenaName;
    }

    @Override
    public boolean isArenaFull() {
        return false;
    }

    @Override
    public void addHero(ComicCharacter hero) {

    }

    @Override
    public void addAntiHero(ComicCharacter antiHero) {

    }

    @Override
    public boolean fightHeroes() {
        return false;
    }
}

package TheWarOfTheComic.engine;

import TheWarOfTheComic.contracts.Arena;
import TheWarOfTheComic.contracts.ComicCharacter;
import TheWarOfTheComic.contracts.Manager;
import TheWarOfTheComic.contracts.SuperPower;

import java.util.*;

public class WarManager implements Manager {

    private Map<String,ComicCharacter> charecters;
    private Map<String,Arena> arenas;
    private Map<String,SuperPower> superPowers;


    public WarManager(){
        this.charecters = new LinkedHashMap<>();
        this.arenas = new LinkedHashMap<>();
        this.superPowers = new LinkedHashMap<>();
    }


    @Override
    public String checkComicCharacter(String characterName) {
       if (this.charecters.containsKey(characterName)){
           return this.charecters.get(characterName).toString();
       }else if (charecters.get(characterName).getHealth() <= 0){
             String.format("%s has fallen in battle!",characterName);
       }
           return String.format("Sorry, fans! %s doesn't exist in our comics!",characterName);

    }

    @Override
    public String addHero(ComicCharacter hero) {
      if(!charecters.containsKey(hero.getName())){
          charecters.put(hero.getName(),hero);
      return String.format("%s is ready for battle!",charecters.get(hero.getName()));
      }
     else if(charecters.containsKey(hero.getName())){
          charecters.replace(hero.getName(),hero);
      }
      return String.format("%s evolved!",hero.getName());
    }

    @Override
    public String addAntiHero(ComicCharacter antiHero) {

        charecters.put(antiHero.getName(),antiHero);
        System.out.println(String.format("%s is ready for destruction!",antiHero.getName()));

             if(charecters.containsKey(antiHero.getName())){
                 charecters.replace(antiHero.getName(),antiHero);
             }
          return String.format("%s is getting stronger!",antiHero.getName());
    }

    @Override
    public String addArena(Arena arena) {
        String result = "A battle is about to start there!";

        if(arenas.containsKey(arena.getArenaName())) {
            return String.format("%s is becoming a fighting ground!", arena.getArenaName());
        }
       arenas.put(arena.getArenaName(),arena);
       return result;

    }

    @Override
    public String addHeroToArena(String arena, String hero) {
        return null;
    }

    @Override
    public String addAntiHeroToArena(String arena, String antiHero) {
        return null;
    }

    @Override
    public String loadSuperPowerToPool(SuperPower superPower) {

        if(superPowers.containsKey(superPower.getName())){
            System.out.println("This super power already exists!");
        }
        superPowers.put(superPower.getName(),superPower);
        return String.format("%s added to pool!",this.superPowers);
    }

    @Override
    public String assignSuperPowerToComicCharacter(String comicCharacter, String superPower) {
        return null;
    }

    @Override
    public String usePowers(String characterName) {
        return null;
    }

    @Override
    public String startBattle(String arena) {
        return null;
    }

    @Override
    public String endWar() {
        return null;
    }
}

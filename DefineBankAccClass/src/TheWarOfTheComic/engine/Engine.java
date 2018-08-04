package TheWarOfTheComic.engine;


import TheWarOfTheComic.entities.ArenaImpl;
import TheWarOfTheComic.entities.Hero.*;
import TheWarOfTheComic.entities.Power;
import TheWarOfTheComic.io.ConsoleReader;
import TheWarOfTheComic.io.ConsoleWriter;

import java.io.IOException;

public class Engine {
    private ConsoleReader reader;
    private ConsoleWriter writer;
    private WarManager manager;

    public Engine() {
        this.reader = new ConsoleReader();
        this.writer = new ConsoleWriter();
        this.manager = new WarManager();
    }

    public void run() throws IOException {

        String command = this.reader.readLine();
        while (!"WAR_IS_OVER".equals(command)) {
            String[] cmdArgs = command.split("\\s+");

            String commandResult = null;

            switch (cmdArgs[0]) {
                case "CHECK_CHARACTER":
                    commandResult = this.manager.checkComicCharacter(cmdArgs[1]);
                    if (!"".equals(commandResult)) {
                        this.writer.writeLine(commandResult);
                    }
                    break;
                case "REGISTER_HERO":

                    //<character name> <type> <energy> <health> <intelligence> <heroism>
                    String characterName = cmdArgs[1];
                    String type = cmdArgs[2];
                    int energy = Integer.parseInt(cmdArgs[3]);
                    double health = Double.parseDouble(cmdArgs[4]);
                    double intelligence = Double.parseDouble(cmdArgs[5]);
                    double heroism = Double.parseDouble(cmdArgs[6]);
                    if (type.equals("DCHero"))
                        this.writer.writeLine(this.manager.addHero(new DcHero(characterName, energy, health, intelligence, heroism)));
                    else
                        this.writer.writeLine(this.manager.addHero(new MarvelHero(characterName, energy, health, intelligence, heroism)));


                    break;
                case "REGISTER_ANTI_HERO":
                    String characterNameAnti = cmdArgs[1];
                    String typeAnti = cmdArgs[2];
                    int energyAnti = Integer.parseInt(cmdArgs[3]);
                    double healthAnti = Double.parseDouble(cmdArgs[4]);
                    double intelligenceAnti = Double.parseDouble(cmdArgs[5]);
                    double evilness = Double.parseDouble(cmdArgs[6]);
                    if (typeAnti.equals("Titan"))
                        this.writer.writeLine(this.manager.addHero(new Titan(characterNameAnti, energyAnti, healthAnti, intelligenceAnti, evilness)));
                    else
                        this.writer.writeLine(this.manager.addHero(new Villain(characterNameAnti, energyAnti, healthAnti, intelligenceAnti, evilness)));

                    break;
                case "BUILD_ARENA":
                    String arenaName = cmdArgs[1];
                    int capacity = Integer.parseInt(cmdArgs[2]);
                     this.writer.writeLine(this.manager.addArena(new ArenaImpl(arenaName,capacity)));
                    break;
                case "SEND_HERO":
                    String arenaNamee = cmdArgs[1];
                    String heroName = cmdArgs[2];
                    this.writer.writeLine(this.manager.addHeroToArena(arenaNamee, heroName));
                    break;
                case "SEND_ANTI_HERO":
                    String arenaNameeAnti = cmdArgs[1];
                    String antiHeroName = cmdArgs[2];
                    this.writer.writeLine(this.manager.addHeroToArena(arenaNameeAnti, antiHeroName));
                    break;
                case "SUPER_POWER":
                    String superPowerName = cmdArgs[1];
                    int powerPoint = Integer.parseInt(cmdArgs[2]);
                     this.writer.writeLine(this.manager.loadSuperPowerToPool(new Power(superPowerName,powerPoint)));

                    break;
                case "ASSIGN_POWER":
                    String comicCharName = cmdArgs[1];
                    String superPowerNamee = cmdArgs[2];
                    this.writer.writeLine(this.manager.assignSuperPowerToComicCharacter(comicCharName, superPowerNamee));
                    break;

                case "UNLEASH":
                    String comicCharNamee = cmdArgs[1];
                    this.writer.writeLine(this.manager.usePowers(comicCharNamee));
                    break;

                case "COMICS_WAR ":

                    String arenaaName = cmdArgs[1];
                    this.writer.writeLine(this.manager.usePowers(arenaaName));

                    break;

            }

            command = this.reader.readLine();
        }

    }
}

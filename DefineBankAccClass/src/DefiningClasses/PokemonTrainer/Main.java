package DefiningClasses.PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (!"Tournament".equals(line = reader.readLine())) {
            try {
                String[] split = line.split(" ");
                String trainerName = split[0];
                String pokemonName = split[1];
                String elementName = split[2];
                int pokemonHealth = Integer.parseInt(split[3]);
                trainers.putIfAbsent(trainerName, new Trainer(trainerName));
                trainers.get(trainerName).getPokemons().add(new Pokemon(pokemonName, elementName, pokemonHealth));
            } catch (Exception e) {

            }
        }


        while (!"End".equals(line = reader.readLine())) {
            String curElement = line;
            if ("Fire".equals(curElement) || "Water".equals(curElement) || "Electricity".equals(curElement)) {
                trainers.entrySet().forEach(tr -> {
                    if (tr.getValue().getPokemons().stream().anyMatch(p -> curElement.equals(p.getElement()))) {
                        tr.getValue().setNumberOfBadges(tr.getValue().getNumberOfBadges() + 1);
                    } else {
                        tr.getValue().loseHealth();
                    }
                });
            }
        }
        trainers.values().stream()
                .sorted((t1, t2) -> {
                    return Integer.compare(t2.getNumberOfBadges(), t1.getNumberOfBadges());
                })
                .forEach(trainer -> System.out.printf("%s %d %d%n"
                        , trainer.getName(), trainer.getNumberOfBadges()
                        , trainer.getPokemons().size()));
    }
}
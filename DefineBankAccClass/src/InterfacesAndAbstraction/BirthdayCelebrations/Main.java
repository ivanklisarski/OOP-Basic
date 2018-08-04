package InterfacesAndAbstraction.BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Identifable> identifables = new ArrayList<>();
        List<Birthable> birthables = new ArrayList<>();

        String line;
        while (true) {
            if ("end".equalsIgnoreCase(line = reader.readLine())) {
                break;
            }

            String[] tokens = line.split("\\s+");
            Identifable identifable = null;

            Birthable birthable = null;
            switch (tokens[0]) {
                case "Citizen":

                    birthable = new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]);
                    birthables.add(birthable);
                    break;
                case "Pet":
                    birthable = new Pet(tokens[1], tokens[2]);
                    birthables.add(birthable);
                    break;
                case "Robot":
                        identifable  = new Robot(tokens[1], tokens[2]);
                        identifables.add(identifable);
                    break;
            }

        }
        String year = reader.readLine();
        birthables
                .stream()
                .filter(birthable -> birthable.getBirthdate().endsWith(year))
                .forEach(birthable -> {
                    System.out.println(birthable.getBirthdate());
                });

    }
}

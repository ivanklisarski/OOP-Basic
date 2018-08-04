package Inheritance.Animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Animal> animals = new ArrayList<>();

        String line;
        while (!"beast!".equalsIgnoreCase(line = reader.readLine())) {

            String type = line.trim().toLowerCase();
            String[] tokens = reader.readLine().trim().split("\\s+");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String gender = tokens[2];

            Animal animal;
            try {
                switch (type) {
                    case "animal":
                        animal = new Animal(name, age, gender);
                        break;
                    case "cat":
                        animal = new Cat(name, age, gender);
                        break;
                    case "kitten":
                        animal = new Kitten(name, age, gender);
                        break;
                    case "tomcat":
                        animal = new Tomcat(name, age, gender);
                        break;
                    case "dog":
                        animal = new Dog(name, age, gender);
                        break;
                    case "frog":
                        animal = new Frog(name, age, gender);
                        break;
                    default:
                        throw new IllegalArgumentException(MessageConstants.INVALID_INPUT);
                }

                animals.add(animal);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }

        for (Animal animal : animals) {
            System.out.println(animal.getInfo());
            animal.produceSound();
        }
    }

}



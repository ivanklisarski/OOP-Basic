package Polymorphism.WildFarm.Animals;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, double animalWeigh, String livingRegion,String breed) {
        super(animalName, animalType, animalWeigh, livingRegion);
        this.setBreed(breed);
    }


    private void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Meowwww";
    }
    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %s, %d]",
                super.getAnimalType(),
                super.getAnimalName(),
                this.breed,
                new DecimalFormat("#.##").format(super.getAnimalWeight()),
                super.getLivingRegion(),
                super.getFoodEaten());
    }
}

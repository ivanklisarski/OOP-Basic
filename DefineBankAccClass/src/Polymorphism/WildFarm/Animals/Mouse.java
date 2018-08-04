package Polymorphism.WildFarm.Animals;

import Polymorphism.WildFarm.Foods.Food;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, double animalWeigh, String livingRegion) {
        super(animalName, animalType, animalWeigh, livingRegion);
    }

    @Override
    public String makeSound() {
        return "SQUEEEAAAK!";
    }
    @Override
    public void eatFood(Food food) {
        if (!"vegetable".equalsIgnoreCase(food.getClass().getSimpleName())) {
            throw new IllegalArgumentException("Mice are not eating that type of food!");
        }
        super.eatFood(food);
    }
}

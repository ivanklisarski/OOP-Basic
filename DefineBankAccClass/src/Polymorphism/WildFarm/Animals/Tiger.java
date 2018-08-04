package Polymorphism.WildFarm.Animals;

import Polymorphism.WildFarm.Foods.Food;

public class Tiger extends Felime {
    public Tiger(String animalName, String animalType, double animalWeigh, String livingRegion) {
        super(animalName, animalType, animalWeigh, livingRegion);
    }

    @Override
    public String makeSound() {
        return "ROAAR!!!";
    }

    @Override
    public void eatFood(Food food) {
        if (!"meat".equalsIgnoreCase(food.getClass().getSimpleName())) {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        super.eatFood(food);
    }
}

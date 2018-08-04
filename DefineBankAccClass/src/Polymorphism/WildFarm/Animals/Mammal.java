package Polymorphism.WildFarm.Animals;



import Polymorphism.WildFarm.Foods.Food;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{

    private String livingRegion;

    protected Mammal(String animalName, String animalType, double animalWeigh,String livingRegion) {
        super(animalName, animalType, animalWeigh);
        this.setLivingRegion(livingRegion);
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    private void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public void eatFood(Food food) {
        super.addFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %d]",
                super.getAnimalType(),
                super.getAnimalName(),
                new DecimalFormat("#.##").format(super.getAnimalWeight()),
                this.livingRegion,
                super.getFoodEaten());
    }

}

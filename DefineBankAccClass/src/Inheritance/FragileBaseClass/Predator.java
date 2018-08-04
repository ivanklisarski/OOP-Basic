package Inheritance.FragileBaseClass;

public class Predator extends Animal{
    private int health;

    public void feed(Food food)
    {
          this.foodEaten.add(food);
    }

}

package Inheritance.FragileBaseClass;

import java.util.ArrayList;
import java.util.Collections;

public class Animal {
    protected ArrayList<Food> foodEaten;

    public final void eatAll(Food[] foods){
        Collections.addAll(foodEaten,foods);
    }

    public final void eat(Food food){
         this.foodEaten.add(food);
    }
}

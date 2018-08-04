package Inheritance.MordorsCrueltyPlan;

import java.util.HashMap;
import java.util.Map;

public class Wizzard {
    private static final Map<String, Integer> FOODS = new HashMap<String, Integer>() {{
        put("cram", 2);
        put("lembas", 3);
        put("apple", 1);
        put("melon", 1);
        put("honeycake", 5);
        put("mushrooms", -10);
    }};
    private int happinessPoints;

    public Wizzard(String... foods) {
        this.setHappinessPoints(foods);
    }

    private int getHappinessPoints(String food) {
        if (FOODS.containsKey(food.trim().toLowerCase())) {
            return FOODS.get(food.trim().toLowerCase());
        }
        return -1;
    }

    public int getHappinessPoints() {
        return this.happinessPoints;
    }

    private void setHappinessPoints(String... foods) {
        int happinessPoints = 0;
        for (String food : foods) {
            happinessPoints += this.getHappinessPoints(food);
        }
        this.happinessPoints = happinessPoints;
    }

    public String getMood() {
        if (this.happinessPoints < -5) {
            return "Angry";
        }

        if (this.happinessPoints < 0) {
            return "Sad";
        }

        if (this.happinessPoints <= 15) {
            return "Happy";
        }

        return "JavaScript";
    }
}

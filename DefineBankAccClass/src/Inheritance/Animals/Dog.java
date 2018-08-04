package Inheritance.Animals;

public class Dog extends Animal{
    public static final String SOUND = "BauBau";

    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return SOUND;
    }
}

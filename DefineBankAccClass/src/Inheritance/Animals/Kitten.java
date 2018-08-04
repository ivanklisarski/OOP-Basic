package Inheritance.Animals;

import static Inheritance.Animals.MessageConstants.INVALID_INPUT;

public class Kitten extends Cat {
    private static final String SOUND = "Miau";

    public Kitten(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected void setGender(String gender) {
        if( !MessageConstants.FEMALE.equalsIgnoreCase(gender.trim())){
            throw  new IllegalArgumentException(INVALID_INPUT);
        }
        super.setGender(gender);
    }

    @Override
    public String produceSound() {
        return SOUND;
    }
}

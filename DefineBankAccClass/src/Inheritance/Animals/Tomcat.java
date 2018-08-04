package Inheritance.Animals;

import static Inheritance.Animals.MessageConstants.INVALID_INPUT;

public class Tomcat extends Cat {
    public static final String SOUND = "Give me one million b***h";

    public Tomcat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected void setGender(String gender) {
        if( !MessageConstants.MALE.equalsIgnoreCase(gender.trim())){
            throw  new IllegalArgumentException(INVALID_INPUT);
        }
        super.setGender(gender);
    }

    @Override
    public String produceSound() {
        return SOUND;
    }
}

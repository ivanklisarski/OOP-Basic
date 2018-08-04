package Inheritance.Animals;

import static Inheritance.Animals.MessageConstants.INVALID_INPUT;

public class Animal {
    private static final String SOUND = "Not implemented!";


    private String name;
    private Integer age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(name == null){
            throw  new IllegalArgumentException(INVALID_INPUT);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(Integer age) {
        if(age == null || age < 1){
            throw  new IllegalArgumentException(INVALID_INPUT);
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    protected void setGender(String gender) {
        if(gender == null ||  (!MessageConstants.MALE.equalsIgnoreCase(gender.trim()) &&
                !MessageConstants.FEMALE.equalsIgnoreCase(gender.trim()))){
            throw  new IllegalArgumentException(INVALID_INPUT);
        }
        this.gender = gender;
    }
    public String getInfo() {
        return String.format("%s%n%s %d %s%n%s", this.getClass().getSimpleName(), this.name, this.age, this.gender, this.produceSound());
    }

    public String produceSound() {
        return SOUND;
    }
}

package InterfacesAndAbstraction.BirthdayCelebrations;

public class Citizen implements Birthable {

    private String name;
    private int age;
    private String id;
    private String birthdate;

    public Citizen(String name, int age, String id, String birthdate) {

        this.name = name;
        this.age = age;
        this.id = id;
        this.birthdate = birthdate;
    }



    @Override
    public String getBirthdate() {
        return this.birthdate;
    }
}

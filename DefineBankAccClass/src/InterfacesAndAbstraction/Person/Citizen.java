package InterfacesAndAbstraction.Person;

public class Citizen implements Person,Birthable,Identifiable{
    private String name;
    private int age;
    private String id;
    private String birthdate ;

    public Citizen(String name, int age,String id,String birthdate ) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getBirthdate() {
        return birthdate;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int age() {
        return age;
    }

    @Override
    public String Birthable() {
        return null;
    }

    @Override
    public String id() {
        return null;
    }
}

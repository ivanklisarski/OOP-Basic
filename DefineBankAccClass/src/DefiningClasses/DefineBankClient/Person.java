package DefiningClasses.DefineBankClient;


import java.util.ArrayList;
import java.util.List;

public class Person {

    String name;
    int age;
    List<BankAccaunt> accaunts;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.accaunts = new ArrayList<>();
    }

    public Person(String name, int age, List<BankAccaunt> accaunts) {
        this.name = name;
        this.age = age;
        this.accaunts = accaunts;
    }

    public double getBalance(){
        return this.accaunts.stream().mapToDouble(x -> x.getBalance()).sum();
    }
}

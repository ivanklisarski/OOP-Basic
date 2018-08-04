package DefiningClasses.Google;

import javafx.scene.Parent;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Parents> parents;
    private List<Pokemon> pokemons;
    private List<Children> children;

    public Person(String name) {
        this(name, null, null);
    }

    public Person(String name, Company company, Car car) {
        this(name, company, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), car);
    }

    public Person(String name, Company company, List<Pokemon> pokemons, List<Parents> parents, List<Children> children, Car car) {
        this.name = name;
        this.company = company;
        this.pokemons = pokemons;
        this.parents = parents;
        this.children = children;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Parents> getParents() {
        return parents;
    }

    public void setParents(List<Parents> parents) {
        this.parents = parents;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName()).append(System.lineSeparator());
        sb.append("Company:").append(System.lineSeparator()).append(this.getCompany()== null ? "" : this.getCompany() + System.lineSeparator());
        sb.append("Car:").append(System.lineSeparator()).append(this.getCar()==null ? "" : this.getCar() + System.lineSeparator());
        sb.append("Pokemon:").append(System.lineSeparator());
        this.getPokemons().forEach(p -> sb.append(p).append(System.lineSeparator()));
        sb.append("Parents:").append(System.lineSeparator());
        this.getParents().forEach(per -> sb.append(per).append(System.lineSeparator()));
        sb.append("Children:").append(System.lineSeparator());
        this.getChildren().forEach(x -> sb.append(x).append(System.lineSeparator()));

        return sb.toString();



    }
}

package Encapsulation.ShopingSpree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        super();
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        this.name = name;
    }

    private void setMoney(double money) {
        if(money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }
    private boolean addMoney(double money) {
        if (money < 0d && money + this.money < 0d) {
            return false;
        }
        this.money += money;
        return true;
    }

    boolean buyProduct(Product product) {
        if (!addMoney(-product.getCost())) {
            return false;
        }
        this.products.add(product);
        return true;
    }

    public String getName() {
        return name;
    }

     List<Product> getProducts() {
        return Collections.unmodifiableList(this.products);

    }
}

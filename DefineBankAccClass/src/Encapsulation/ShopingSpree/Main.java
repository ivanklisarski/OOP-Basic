package Encapsulation.ShopingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> persons = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();

        String[] people = reader.readLine().split("[=;]");
        try {


            for (int i = 0; i < people.length; i += 2) {
                persons.put(people[i], new Person(people[i], Double.parseDouble(people[i + 1])));
            }
            String[] prod = reader.readLine().split("[=;]");
            for (int i = 0; i < prod.length; i += 2) {
                products.put(prod[i], new Product(prod[i], Double.parseDouble(prod[i + 1])));

            }
            String purchased;
            while (!"END".equalsIgnoreCase(purchased = reader.readLine())) {
                String[] tokens = purchased.split("\\s+");
                String personName = tokens[0];
                String productName = tokens[1];

                if (persons.get(personName).buyProduct(products.get(productName))) {
                    System.out.printf("%s bought %s\n", personName, productName);
                } else {
                    System.out.printf("%s can't afford %s%n", personName, productName);

                }}
                for (Person person : persons.values()) {
                    System.out.println(getPersonInfo(person));
                }


        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }

    private static String getPersonInfo(Person person) {
        StringBuilder info = new StringBuilder();
        info.append(person.getName()).append(" - ");
        if (person.getProducts().isEmpty()) {
            info.append("Nothing bought");
        } else {
            for (Product product : person.getProducts()) {
                info.append(product.getName()).append(", ");
            }
            info.delete(info.lastIndexOf(", "), info.length());
        }
        return info.toString();
    }
}

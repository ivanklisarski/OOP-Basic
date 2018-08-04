package DefiningClasses.DefineClassPerson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Person> personsMap = new TreeMap<>();
        Set<Person> personSet = new TreeSet<>();

         int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
         String[] person = reader.readLine().split("\\s+");

         String name = person[0];
         int age = Integer.parseInt(person[1]);

            Person p = new Person(name, age);
            personSet.add(p);
              // personsMap.put(name,p);

        }
        personSet.stream().filter(p -> p.getAge() > 30).forEach(System.out::println);
       // personsMap.entrySet().stream().filter(p -> p.getValue().getAge() > 30).forEach(System.out.println(personsMap.values()));
    }


}

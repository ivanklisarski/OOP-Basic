package Inheritance.MordorsCrueltyPlan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] foods = reader.readLine().trim().toLowerCase().split("\\s+");

        Wizzard gandalf = new Wizzard(foods);

        System.out.println(gandalf.getHappinessPoints());
        System.out.println(gandalf.getMood());

    }
}

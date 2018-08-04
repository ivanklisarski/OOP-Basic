package DefiningClasses.Constructors_and_static_members;



import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        Map<Integer,BankAccaunt> accounts = new HashMap<>();

        String command = scanner.nextLine();

        while (!"End".equals(command)) {
            String[] commandArgs = command.split("\\s+");


            String cmdType = commandArgs[0];
            switch (cmdType) {
                case "Create":
                  BankAccaunt acc = new BankAccaunt();
                  accounts.put(acc.getId(),acc);
                    System.out.println("Account ID"+acc.getId()+ " created");
                    break;
                case "Deposit":
                          int id = Integer.valueOf(commandArgs[1]);
                          double amaunt = Double.valueOf(commandArgs[2]);

                          try {
                              accounts.get(id).deposit(amaunt);
                              System.out.printf("Deposited %.0f to ID%d%n",amaunt,id);
                          }catch (Exception ex){
                              System.out.println("Account does not exist");
                          }
                    break;
                case "SetInterest":
                    BankAccaunt.setInterest(Double.parseDouble(commandArgs[1]));
                    break;
                case "GetInterest":
                    try {
                        System.out.printf("%.2f%n",accounts.get(Integer.parseInt(commandArgs[1])).getInterest(Integer.parseInt(commandArgs[2])));
                    }catch (Exception ex){
                        System.out.println("Account does not exist");
                    }
                    break;


            }
            command = scanner.nextLine();
        }
    }

}

package DefiningClasses.DefineBankClient;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccaunt> accounts = new HashMap<>();

        String command = scanner.nextLine();

        while (!"End".equals(command)) {
            String[] commandArgs = command.split("\\s+");


            String cmdType = commandArgs[0];
            switch (cmdType) {
                case "Create":
                    exaccCreate(commandArgs, accounts);
                    break;
                case "Deposit":
                    exaccDeposit(commandArgs, accounts);
                    break;
                case "Withdraw":
                    exaccWhitdraw(commandArgs, accounts);
                    break;
                case "Print":
                    exaccPrint(commandArgs, accounts);
                    break;


            }
            command = scanner.nextLine();
        }


    }

    private static void exaccPrint(String[] commandArgs, Map<Integer, BankAccaunt> accounts) {
        int id = Integer.valueOf(commandArgs[1]);
        if (accounts.get(id) == null) {
            System.out.println("Account does not exist");

        } else {
            System.out.println(accounts.get(id));
        }
    }

    private static void exaccWhitdraw(String[] commandArgs, Map<Integer, BankAccaunt> accounts) {
        int id = Integer.valueOf(commandArgs[1]);
        double amount = Double.valueOf(commandArgs[2]);
        BankAccaunt acc = accounts.get(id);
        if (acc != null) {
            if (acc.getBalance() < amount) {
                System.out.println("Insufficient balance");
            } else {
                acc.whithdraw(amount);
            }
        } else {
            System.out.println("Account does not exist");
        }

    }

    private static void exaccDeposit(String[] commandArgs, Map<Integer, BankAccaunt> accounts) {
        int id = Integer.valueOf(commandArgs[1]);
        double amount = Double.valueOf(commandArgs[2]);
        if (accounts.get(id) == null) {
            System.out.println("Account does not exist");

        } else {
            accounts.get(id).deposite(amount);
        }
    }

    private static void exaccCreate(String[] commandArgs, Map<Integer, BankAccaunt> accounts) {

        int id = Integer.valueOf(commandArgs[1]);
        if (accounts.containsKey(id)) {
            System.out.println("Account already exists");
        } else {
            BankAccaunt accaunt = new BankAccaunt();
            accaunt.setId(id);
            accounts.put(id, accaunt);
        }
    }
}


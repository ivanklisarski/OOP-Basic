package InterfacesAndAbstraction.Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

          String[] phoneNumbers = reader.readLine().split("\\s+");
          String[] sites = reader.readLine().split("\\s+");

        SmartPhone smartphone = new SmartPhone();

        Arrays.stream(phoneNumbers).forEach(phoneNumber -> {
            try {
                System.out.println(smartphone.callOtherPhones(phoneNumber));
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        });

        Arrays.stream(sites).forEach(url -> {
            try {
                System.out.println(smartphone.browseTheWorldWideWeb(url));
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        });

    }
}

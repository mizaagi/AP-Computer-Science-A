package Q1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog209a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog215a.dat"));
            int current;
            int totalplus = 0;
            int totalless = 0;
            while (file.hasNext()) {
                current = file.nextInt();
                if (current >= 500) totalplus += current;
                else totalless += current;

            }
            System.out.println("Total of numbers >= 500: " + totalplus);
            System.out.println("Total of numbers < 500: " + totalless);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

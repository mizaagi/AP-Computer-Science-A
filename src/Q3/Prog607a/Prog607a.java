package Q3.Prog607a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog607a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/FILENAME"));

            while (file.hasNext()) {

            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

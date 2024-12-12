package Q2.Prog215h;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog215h {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog215h.txt"));

            while (file.hasNext()) {

            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

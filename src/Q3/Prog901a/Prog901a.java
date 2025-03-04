package Q3.Prog901a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog901a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog512h.dat"));

            while (file.hasNext()) {

            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

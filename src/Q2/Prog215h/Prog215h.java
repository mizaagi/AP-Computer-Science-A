package Q2.Prog215h;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog215h {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog215h.txt"));

            while (file.hasNext()) {
                double[] scores = new double[8];
                double s1, s2, s3, s4, s5, s6, s7, s8;
                s1 = file.nextDouble();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

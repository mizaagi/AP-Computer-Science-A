package Q2.Prog435a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog435a.dat"));

            while (file.hasNext()) {
                int vType = file.nextInt();
                int gate  = file.nextInt();
                Cl435a car = new Cl435a(vType, gate);
                car.calc();
                System.out.println(car);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

package Q2.Prog435a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog435a.dat"));
            Cl435a[] cars = new Cl435a[18];
            int count = 0;
            while (file.hasNext()) {
                int vType = file.nextInt();
                int gate  = file.nextInt();
                Cl435a car = new Cl435a(vType, gate);
                car.calc();
                cars[count] = car;
                count++;
            }
            for (Cl435a car : cars)
                System.out.println(car);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

package Q2.Prog214b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog214b.dat"));

            while (file.hasNext()) {
                int empNum       = file.nextInt();
                double ytdPay    = file.nextDouble();
                double bpRate    = file.nextDouble();
                double sCode     = file.nextDouble();
                double hrsWorked = file.nextDouble();
                Cl214b employee = new Cl214b(empNum, ytdPay, bpRate, sCode, hrsWorked);
                employee.calc();
                System.out.println(employee);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

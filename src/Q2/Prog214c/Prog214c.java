package Q2.Prog214c;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Prog214c {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog214c.dat"));
            ArrayList<Cl214c> customers = new ArrayList<Cl214c>();

            while (file.hasNext()) {
                String gr = file.next();
                double ga = file.nextDouble();
                String d = file.next();
                Cl214c customer = new Cl214c(ga, gr, d);
                customer.calc();
                customers.add(customer);
            }

            for (Cl214c c : customers)
                System.out.print(c);
            
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

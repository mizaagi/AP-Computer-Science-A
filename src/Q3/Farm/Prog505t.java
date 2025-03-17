package Q3.Farm;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/Prog505t.dat"));
            List<Animal> animals = new ArrayList<>();
            /*
            int hay = file.nextInt();
            double hayCost = file.nextDouble();
            int corn = file.nextInt();
            double cornCost = file.nextDouble();
             */

            while (file.hasNext()) {

            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

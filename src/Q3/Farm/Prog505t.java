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

            ArrayList<Horse> horses = new ArrayList<>();
            ArrayList<Cow> cows = new ArrayList<>();
            int hayBales = file.nextInt();
            double hbCost = file.nextDouble();
            int cornCobs = file.nextInt();
            double ccCost = file.nextDouble();
            int numCows = file.nextInt();

            for (int i = 0; i < numCows; i++) {
                double weight = file.nextDouble();

            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

package Q2.Prog410t;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Prog410t {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/survey2.dat"));

            Cl410t[] households = new Cl410t[25];
            int count = 0;
            double pov = 0.0;
            while (file.hasNext()) {
                int id      = file.nextInt();
                int income  = file.nextInt();
                int members = file.nextInt();
                Cl410t household = new Cl410t(id, income, members);
                households[count] = household;
                count++;
            }
            for (Cl410t x : households) {
                if (x != null)
                    if (x.getIncome() < 3750 + (750 * (x.getMembers()-2))) {
                        pov++;
                    }
            }
            System.out.println("Pov= " + pov + "count: " + count);
            double percent = pov / count;
            System.out.println("id\t\tincome\tmembers");
            for (Cl410t x : households) {
                if (x != null) // whatever
                    System.out.println(x);
            }
            System.out.println("Percentage of households below poverty line: " + percent);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

package Q2.Prog410t;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Prog410t {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/survey.dat"));

            Cl410t[] households = new Cl410t[];
            int count = 0;
            int pov = 0;
            while (file.hasNext()) {
                int id      = file.nextInt();
                int income  = file.nextInt();
                int members = file.nextInt();
                Cl410t household = new Cl410t(id, income, members);
                households[count] = household;
                count++;
            }
            for (Cl410t x : households) {
                if (x.getIncome() < 3750 + (750 * (x.getMembers()-2))) {
                    pov++;
                }
            }
            double percent = pov / 25.0;
            System.out.println("id\t\tincome\tmembers");
            for (Cl410t x : households) {
                System.out.println(x);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

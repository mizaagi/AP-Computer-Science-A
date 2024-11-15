package Q2.Prog402a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prg402a.dat"));
            System.out.println("ID\tScore\tDiff");
            double avg = 0;
            int lcv = 0;
            Cl402a[] studentArr = new Cl402a[21];
            while (file.hasNext()) {
                int id = file.nextInt();
                int score = file.nextInt();
                Cl402a student = new Cl402a(id, score);
                studentArr[lcv] = student;
                lcv++;
            }
            for (Cl402a x : studentArr) {
                avg += x.getScore();
            }
            avg /= 21.0;
            for (Cl402a x : studentArr) {
                x.calc(avg);
                System.out.println(x);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

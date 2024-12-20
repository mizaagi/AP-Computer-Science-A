package Q2.Prog215h;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog215h {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog215h.txt"));
            Cl215h[] athletes = new Cl215h[6];
            int count = 0;
            while (file.hasNext()) {
                double[] scores = new double[8];
                scores[0] = file.nextDouble();
                scores[1] = file.nextDouble();
                scores[2] = file.nextDouble();
                scores[3] = file.nextDouble();
                scores[4] = file.nextDouble();
                scores[5] = file.nextDouble();
                scores[6] = file.nextDouble();
                scores[7] = file.nextDouble();
                Cl215h athlete = new Cl215h(count, scores);
                athlete.calc();
                athletes[count] = athlete;
                count++;
            }
            for (Cl215h a : athletes)
                System.out.println(a);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
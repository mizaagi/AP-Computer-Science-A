package Q3.Prog702p;

import java.io.File;
import java.io.IOException;
import java.sql.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Prog702p {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog701g.dat"));
            double hicAvg = 0.0;
            double walAvg = 0.0;
            double bepAvg = 0.0;
            double count = 0.0;
            int choice = 0;
            int[] alphaCount = new int[26];
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            ArrayList<Hicca> hiccas   = new ArrayList<Hicca>();
            ArrayList<Wallie> wallies = new ArrayList<Wallie>();
            ArrayList<Beeper> beepers = new ArrayList<Beeper>();
            while (file.hasNext()) {
                choice = file.nextInt();
                if (choice == 1) {
                    Hicca h = new Hicca(file.next(), file.next(), file.nextDouble());
                    hiccas.add(h);
                } else if (choice == 2) {
                    Wallie w = new Wallie(file.next(), file.next(), file.nextInt());
                    wallies.add(w);
                } else if (choice == 3) {
                    Beeper b = new Beeper(file.next(), file.next(), file.next());
                    beepers.add(b);
                }
            }
            for (Beeper b : beepers) {
                bepAvg += b.getExtraWord().length();
                count++;
            }
            bepAvg /= count;
            count = 0;
            for (Wallie w : wallies) {
                walAvg += w.getSteps();
                count++;
            }
            walAvg /= count;
            count = 0;
            for (Hicca h : hiccas) {
                hicAvg += h.getFurPrice();
                count++;
            }
            hicAvg /= count;
            for (Beeper b : beepers) {
                for (int i = 0; i < b.getExtraWord().length(); i++) {
                    alphaCount[alphabet.indexOf(b.getExtraWord().substring(i, i+1))]++;
                }
            }
            String mostCom = "";
            int max = -1;
            for (int i = 0; i < 26; i++) {
                if (alphaCount[i] > max) {
                    max = alphaCount[i];
                    mostCom = alphabet.substring(i, i+1);
                }
            }

            System.out.println("The average value of the Hicca fur is: " + hicAvg);
            System.out.println("The average number of steps taken by the Wallies is: " + walAvg);
            System.out.println("The average size of the Beeper's word is: " + bepAvg);
            System.out.println("The most common letter of the Beeper's word is " + mostCom);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

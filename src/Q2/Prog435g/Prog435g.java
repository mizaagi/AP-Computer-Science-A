package Q2.Prog435g;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435g {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog435g.dat"));
            int[] scores = new int[100];
            int count = 0;

            while (file.hasNext()) {
                int score = file.nextInt();
                scores[count] = score;
                count++;
            }

            // sort the scores ( bubble sort )
            for (int j = 0; j < count; j++) {
                for (int k = 0; k < count-1; k++) {
                    if (scores[k] > scores[k+1]) {
                        int temp    = scores[k];
                        scores[k]   = scores[k+1];
                        scores[k+1] = temp;
                    }
                }
            }

            Cl435g[] golfers = new Cl435g[count];
            for (int lcv = 0; lcv < count; lcv++) {
                Cl435g cooldude = new Cl435g(scores[lcv]);
                golfers[lcv] = cooldude;
            }

            int rank = 1;
            for (int lcv = 0; lcv < count; lcv++) {
                golfers[lcv].setRank(rank);
                if (lcv < count-1 && scores[lcv] != scores[lcv+1])
                    rank++;
            }

            System.out.println("Score\tRank");
            for (int lcv = 0; lcv < count; lcv++)
                System.out.println(golfers[lcv].toString());

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

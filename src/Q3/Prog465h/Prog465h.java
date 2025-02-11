package Q3.Prog465h;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465h.dat"));

            while (file.hasNext()) {
                int k = file.nextInt();
                int l = file.nextInt();
                int[][] mat = new int[k][l];
                for (int i = 0; i < k; i++)
                    for (int j = 0; j < l; j++)
                        mat[i][j] = file.nextInt();
                ArrayFixer hello = new ArrayFixer(mat, k, l);
                hello.calcReduced();
                if (hello.shouldBeReduced() == 1) {
                    System.out.println("REDUCED");
                    hello.printFormattedReduced();
                }
                else {
                    System.out.println("NORMAL");
                    hello.printFormattedNormal();
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
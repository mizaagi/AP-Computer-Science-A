package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[5][5];

            for (int r = 0; r < mat.length; r++)
                for (int c = 0; c < mat[r].length; c++)
                    mat[r][c] = file.nextInt();

            System.out.println("Original Matrix:");
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++)
                    System.out.print(mat[r][c] + " ");
                System.out.println();
            }
            System.out.println();
            int tot1 = 0;
            int c = 0;
            for (int r = 0; r < mat.length; r++) {
                tot1 += mat[r][c];
                c++;
            }
            int tot2 = 0;
            c = 4;
            for (int r = 4; r >= 0; r--) {
                tot2 += mat[r][4-c];
                c--;
            }

            System.out.println("Main Diagonal Sum: " + tot1);
            System.out.println("Second Diagonal Sum: " + tot2);


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

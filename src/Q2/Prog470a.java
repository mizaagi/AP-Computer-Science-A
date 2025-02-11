package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[6][5];  // 6 rows, 6 cols

            for (int r = 0; r < mat.length-1; r++)
                for (int c = 0; c < mat[r].length; c++)
                    mat[r][c] = file.nextInt();

            System.out.println("Original Matrix:");
            for (int r = 0; r < mat.length-1; r++) {
                for (int c = 0; c < mat[r].length-1; c++)
                    System.out.print(mat[r][c] + " ");
                System.out.println();
            }
            System.out.println();

            for (int r = 0; r < mat.length-1; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    mat[5][c] += mat[r][c];
                }
            }

            System.out.println("With Totals:");
            for (int[] row : mat) {
                for (int n : row)
                    System.out.print(n + "\t");
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

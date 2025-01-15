package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465c {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465c.dat"));
            int r = file.nextInt();
            int c = file.nextInt();
            int[][] mat = new int[r][c];
            int tot = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    mat[i][j] = file.nextInt();
                    //if (i == 0 || i )
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

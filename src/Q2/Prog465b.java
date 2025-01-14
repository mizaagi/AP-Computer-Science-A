package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465b.dat"));
            int[][] mat = new int[3][4];  // 6 rows, 6 cols
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    mat[i][j] = file.nextInt();
                }
            }






        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
Original Matrix:
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87

With Totals:
45	67	89	12	-3	210
-3	-6	-7	-4	-9	-29
96	81	-8	52	12	233
14	-7	72	29	-1	107
19	43	28	63	87	240
171	178	174	152	86	761
*/
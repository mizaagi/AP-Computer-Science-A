package Q3.Prog492h;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog492h {
    public static void main(String[] args) {
        try {
            // SETUP
            Scanner file = new Scanner(new File("Langdat/prog492h.dat"));
            String[][] life = new String[30][30];
            String[][] nextGen = new String[30][30];
            int r = 0;

            // READING FILE INTO ARRAY
            while (file.hasNext()) {
                String line = file.nextLine();
                for (int i = 0; i < 30; i++) {
                    life[r][i] = line.substring(i, i+1);
                }
                r++;
            }
            

            // MAIN CODE
            printArr(life);
            for (int gen = 1; gen <= 15; gen++) {
                life = update(life);
                System.out.println(gen);
                printArr(life);
            }
            

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static String[][] update(String[][] gen1) {
        /*
        [mat[m-1][n-1]      mat[m-1][n]     mat[m-1][n+1]]
        [mat[m][n-1]        mat[m][n]       mat[m][n+1]]
        [mat[m+1][n-1]      mat[m+1][n]     mat[m+1][n+1]]
        */
        int neighbors = 0;
        String[][] gen2 = gen1;
        for (int m = 0; m < 30; m++) {
            for (int n = 0; n < 30; n++) {
                neighbors = 0;
                for (int ro = -1; ro < 2; ro++)
                    for (int co = -1; co < 2; co++)
                        if ((!(ro == 0 && co == 0)) && m+ro != -1 && n+co != -1 && m+ro != 30 && n+co != 30)
                            if (gen1[m+ro][n+co].equals("*"))
                                neighbors++;
                if (gen1[m][n].equals("."))
                    if (neighbors == 3)
                        gen2[m][n] = "*";
                    else
                    if (neighbors <= 1 || neighbors >= 4)
                        gen2[m][n] = ".";
            }
        }

        return gen2;
    }

    public static void printArr(String[][] bigMat) {
        for (String[] mat : bigMat) {
            for (String c : mat) {
                System.out.print(c);
            }
            System.out.print("\n");
        }
    }
}

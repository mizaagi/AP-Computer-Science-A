package Q3.Prog492h;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog492h {
    public static void main(String[] args) {
        try {
            // SETUP
            Scanner file = new Scanner(new File("Langdat/prog492h.dat"));
            char[][] life = new char[31][30];
            char[][] nextGen = new char[31][30];
            int r = 0;

            // READING FILE INTO ARRAY
            while (file.hasNext()) {
                String line = file.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    life[r][i] = line.charAt(i);
                }
                r++;
            }
            

            // MAIN CODE
            printArr(life);
            for (int gen = 1; gen <= 15; gen++) {
                for (int i = 0; i < 31; i++) {
                    for (int j = 0; j < 30; j ++) {
                        update(life, nextGen, i, j);
                    }
                }
                life = nextGen;
                printArr(life);
            }
            

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void update(char[][] gen1, char[][] gen2, int m, int n) {
        /*
        [mat[m-1][n-1]      mat[m-1][n]     mat[m-1][n+1]]
        [mat[m][n-1]        mat[m][n]       mat[m][n+1]]
        [mat[m+1][n-1]      mat[m+1][n]     mat[m+1][n+1]]
        */
        int neighbors = 0;
        for (int hola = -1; hola < 2; hola++)
            for (int hello = -1; hello < 2; hola++)
                if (!(hola == 0 && hello == 0) && mat[m+hola][n+hello] == '*') neighbors++;
        
        if (gen1[m][n] == '.')
            if (neighbors == 3)
                gen2[m][n] = '*';
        else
            if (neighbors <= 1 || neighbors >= 4)
                gen2[m][n] = '.';
    }

    public static void printArr(char[][] bigMat) {
        for (char[] mat : bigMat) {
            System.out.print("[");
            for (char c : mat) {
                System.out.print(c + ", ");
            }
            System.out.print("],\n");
        }
    }
}

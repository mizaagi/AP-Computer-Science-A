package Q3.Prog492h;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog492h {
    public static void main(String[] args) {
        try {
            // SETUP
            Scanner file = new Scanner(new File("Langdat/prog492h.dat"));
            String[][] arr = new String[30][30];
            int r = 0;

            // READING FILE INTO ARRAY
            while (file.hasNext()) {
                String line = file.nextLine();
                for (int i = 0; i < 30; i++) {
                    arr[r][i] = line.substring(i, i+1);
                }
                r++;
            }
            

            // MAIN CODE
            printArr(arr);
            ThisIsDumb2 hola = new ThisIsDumb2(arr);
            for (int gen = 1; gen <= 15; gen++) {
                hola.newGen();
                System.out.println(gen);
                printArr(hola.getLife());
            }
            

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
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

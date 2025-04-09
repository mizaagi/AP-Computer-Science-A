package Q3.MSOE;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class msoe2021_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first letter: ");
        String c1 = input.nextLine();
        System.out.println("Enter line of text: ");
        String line = input.nextLine();
        if (line.contains(c1)) {
            int x = line.indexOf(" ");
            while (!line.substring(x-1, x).equals(c1) && line.contains(" ")) {
                line = line.substring(x + 1);
                x = line.indexOf(" ");
            }
            if (line.contains(" "))
                System.out.println(line.substring(0, line.indexOf(" ")));
            else
                System.out.println(line);
        } else {
            System.out.println("not found");
        }

    }
}

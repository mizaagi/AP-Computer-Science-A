package Q1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213e {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog213e.dat"));
            int g1 = 0;
            int g2 = 0;
            int g3 = 0;
            int g4 = 0;
            int g5 = 0;
            int num;
            while (file.hasNext()) {
                num = file.nextInt();
                if (num < 20) {
                    g1 += num;
                } else if (num >= 20 && num < 40) {
                    g2 += num;
                } else if (num >= 40 && num < 60) {
                    g3 += num;
                } else if (num >= 60 && num < 80) {
                    g4 += num;
                } else if (num >= 80) {
                    g5 += num;
                }

            }
            double total = g1+g2+g3+g4+g5;
            double p1 = 100*g1/total;
            double p2 = 100*g1/total;
            double p3 = 100*g1/total;
            double p4 = 100*g1/total;
            double p5 = 100*g1/total;
            System.out.println("Group\tDistribution\tPercentage");
            System.out.println("0-19\t\t" + g1 + "\t\t" + p1);
            System.out.println("20-39\t\t" + g2 + "\t\t" + p2);
            System.out.println("40-59\t\t" + g3 + "\t\t" + p3);
            System.out.println("60-80\t\t" + g4 + "\t\t" + p4);
            System.out.println(">80\t\t" + g5 + "\t\t" + p5);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

package Q3.Prog703s;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog703s.dat"));
            List<Computer> pcs = new ArrayList<Computer>();
            int v7 = 0;
            int gg = 0;
            int fives = 0;

            while (file.hasNext()) {
                if (file.nextInt() == 1) {
                    String name = file.next();
                    int num = file.nextInt();
                    double value = file.nextDouble();
                    String color = file.next();
                    Apple a = new Apple(name, num, value, color);
                    pcs.add(a);
                    if (a.getColor().equals("Green") || a.getColor().equals("Gold")) gg++;
                } else if (file.nextInt() == 2) {
                    String name = file.next();
                    int num = file.nextInt();
                    double value = file.nextDouble();
                    double version = file.nextDouble();
                    Windows w = new Windows(name, num, value, version);
                    pcs.add(w);
                    if (w.getVersion() == 7.0) v7++;
                } else if (file.nextInt() == 3) {
                    String name = file.next();
                    int num = file.nextInt();
                    double value = file.nextDouble();
                    int code = file.nextInt();
                    Linux l = new Linux(name, num, value, code);
                    pcs.add(l);
                    if (String.valueOf(l.getCode()).charAt(String.valueOf(l.getCode()).length()-1) == '5') fives++; 
                }
            }

        System.out.println("Number of Apple computers with color Green or Gold: " + gg);
        System.out.println("Number of Windows computers with version 7.0: " + v7);
        System.out.println("Number of Linux computers with special code ending in 5: " + fives);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
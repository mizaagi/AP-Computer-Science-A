package Q2.Prog602b;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Prog602b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog602b.dat"));
            ArrayList<InternetCustomer> list = new ArrayList<InternetCustomer>();

            while (file.hasNext()) {
                int id = file.nextInt();
                double hours = file.nextDouble();
                int code = file.nextInt();

                InternetCustomer fred = new InternetCustomer(id, hours, code);
                list.add(fred);
            }

            for (int lcv = 0; lcv < list.size(); lcv++) {
                InternetCustomer me = list.get(lcv);
                me.setCharge();
            }

            System.out.println("Accoutn #\tHours\t\tCode\t\tAmount Due");
            for (InternetCustomer c : list)
                System.out.printf("%d\t%.2f\t\t%d\t\t\t%.2f\n", c.getAcc(), c.getHours(), c.getCode(), c.getCharge());
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}

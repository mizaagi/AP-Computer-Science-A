package Q2.LP3_10;
import java.util.Scanner;

public class LP3_10 {
    public static void main(String[] args) {
        int b, f, s;
        double t;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of burgers: ");
        b = input.nextInt();
        System.out.print("Enter the number of fries: ");
        f = input.nextInt();
        System.out.print("Enter the number of sodas: ");
        s = input.nextInt();

        ClLP3_10 transaction = new ClLP3_10(b, f, s);
        transaction.calc();
        System.out.println(transaction);
        System.out.print("Enter amount tendered: ");
        t = input.nextDouble();
        transaction.calc_tender(t, transaction.getFintot());
        System.out.println(transaction.getChangeString());
    }
}

package Q1;
import java.util.*;

public class Prog65h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter pounds: ");
        int basePounds = input.nextInt();
        System.out.println("enter shillings: ");
        int baseShillings = input.nextInt();
        System.out.println("enter pence: ");
        int basePence = input.nextInt();

        double whoa = basePounds + 0.05*baseShillings + 0.0041*basePence;
        System.out.println("Decimal pounds = " + whoa);
    }
}

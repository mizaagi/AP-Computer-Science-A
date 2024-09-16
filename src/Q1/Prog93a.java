package Q1;
import java.util.*;

public class Prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter KWH used: ");
        int kwh = input.nextInt();
        double total = kwh * 0.0475;

        System.out.println("Base Rate\t" + kwh + " @ $0.0475\t$" + total);
        System.out.println("Surcharge\t\t$" + total/10);
        System.out.println("Citytax\t\t$" + total*0.03);
        System.out.println("Pay\t\t$" + (total/10 + total + total*0.03));
        System.out.println("Pay If Late\t\t$" + ((total/10 + total + total*0.03)*1.04));
    }
}

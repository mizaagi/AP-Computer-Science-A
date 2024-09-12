package Q1;
import java.util.*;

public class Prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter purchase price: ");
        double pprice = input.nextDouble();
        System.out.println("Enter amount received: ");
        double received = input.nextDouble();
        double changeTotal = Math.round((received - pprice) * 100.0) / 100.0;
        System.out.println(changeTotal);



        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);


    }
}

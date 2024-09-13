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

        int dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        while (changeTotal >= 1)    { dollars += 1; changeTotal -= 1; }
        while (changeTotal >= 0.25) { quarters += 1; changeTotal -= 0.25; }
        while (changeTotal >= 0.10) { dimes += 1; changeTotal -= 0.10; }
        while (changeTotal >= 0.05) { nickels += 1; changeTotal -= 0.05; }
        while (changeTotal >= 0.01) { pennies += 1; changeTotal -= 0.01; }


        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);


    }
}

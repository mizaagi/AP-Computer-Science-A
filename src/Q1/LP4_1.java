package Q1;
import java.util.Scanner;

public class LP4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of copies: ");
        int copies = input.nextInt();
        double price = 0;
        if (copies >= 0 && copies <= 99) {
            price = 0.3 * copies;
        } else if (copies >= 100 && copies <= 499) {
            price = 0.28 * copies;
        } else if (copies >= 500 && copies <= 749) {
            price = 0.27 * copies;
        } else if (copies >= 750 && copies <= 1000) {
            price = 0.26 * copies;
        } else if (copies >= 1000) {
            price = 0.25 * copies;
        }
        System.out.println("The total price is $" + price + ".");
    }
}

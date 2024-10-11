package Q1;
import java.util.Scanner;

public class LP5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        String base = input.nextLine();
        int num1 = base.charAt(0) - '0';
        int num2 = base.charAt(1) - '0';
        int num3 = base.charAt(2) - '0';
        int tot = (num1+num2+num3);
        String total = Integer.toString(tot);
        System.out.print("The sum of the digits is: " + total);
    }
}

package Q1;
import java.util.Scanner;

public class LP4_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double y;
        double n;
        double k;
        double t;

        System.out.print("Enter initial bacteria amount: ");
        n = input.nextDouble();
        System.out.print("Enter a constant value for k: ");
        k = input.nextDouble();
        System.out.print("Enter the growth period time in hours: ");
        t = input.nextDouble();

        y = n * Math.pow(Math.E, (k * t));
        System.out.println(y + " bacteria will be present after " + t + " hours.");
    }
}

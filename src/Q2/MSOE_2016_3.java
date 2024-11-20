package Q2;
import java.util.Scanner;

public class MSOE_2016_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double r1 = input.nextDouble();
        double r2 = input.nextDouble();
        double d = input.nextDouble();
        double f = (n - 1) * ((1/r1) - (1/r2) + (((n - 1) * d) / (n * r1 * r2)));
        System.out.println("1/f is equal to " + f + ".");
    }
}

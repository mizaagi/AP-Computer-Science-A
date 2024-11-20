package Q2;
import java.util.Scanner;

public class MSOE_2016_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = input.nextDouble();
        System.out.println("Enter c: ");
        double c = input.nextDouble();
        System.out.println("Enter angle a: ");
        double A = Math.toRadians(input.nextDouble());
        double C = Math.toDegrees(Math.asin((Math.sin(A) / a) * c));
        double C2 = 1000;
        if (A + C < 180)
            C2 = 180-C;
        System.out.println("The two possible solutions are " + C + " and " + C2 + ".");

    }
}

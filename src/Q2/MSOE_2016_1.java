package Q2;
import java.util.Scanner;

public class MSOE_2016_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = input.nextDouble();
        System.out.println("Enter c: ");
        double c = input.nextDouble();
        System.out.println("Enter angle a: ");
        double A = input.nextDouble();
        double cC;
        double o = (Math.sin(A) / a) * c;
    }
}

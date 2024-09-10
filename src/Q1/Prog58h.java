package Q1;
import java.util.*;

public class Prog58h {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("P: ");
            double P = input.nextDouble();
            System.out.println("r: ");
            double r = input.nextDouble();
            System.out.println("n: ");
            double n = input.nextDouble();
            System.out.println("t: ");
            double t = input.nextDouble();
            System.out.println(Math.pow(((0.01*r)/n), (n*t)/365));
            double A = P * (Math.pow((1 + (0.01*r)/n), (n*t)/365));
            System.out.println("A = " + A);
    }
}
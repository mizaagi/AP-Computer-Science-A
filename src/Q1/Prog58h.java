package Q1;
import java.util.*;

public class Prog58h {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("P: ");
            int P = input.nextInt();
            System.out.println("r: ");
            int r = input.nextInt();
            System.out.println("n: ");
            int n = input.nextInt();
            System.out.println("t: ");
            int t = input.nextInt();

            int A = P * ((1 + Math.pow(((0.01*r)/n), (n*t)/365)));
            System.out.println("A = ", A);
    }
}
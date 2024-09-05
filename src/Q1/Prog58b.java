package Q1;
import java.util.*;

public class Prog58b {
    public static void main(String[] args) {
        System.out.println("enter the first number: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("enter the second number: ");
        int b = input.nextInt();
        System.out.println("enter the third number: ");
        int c = input.nextInt();

        double root1 = ((-1 * b)+Math.sqrt(Math.pow(b, 2.0)-(4*a*c)))/(2*a);
        double root2 = ((-1 * b)-Math.sqrt(Math.pow(b, 2.0)-(4*a*c)))/(2*a);

        System.out.print("Root 1 is " + root1 + " and root 2 is " + root2);
    }
}

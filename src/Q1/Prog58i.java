package Q1;
import java.util.*;

public class Prog58i {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount I wish to borrow is $");
        double p = input.nextDouble();

        System.out.print("The loan rate is ");
        double r = input.nextDouble();

        System.out.print("The # of months to pay off the loan is ");
        double m = input.nextDouble();

        double r_over_1200 = r/1200;
        double mp = p * (r_over_1200 * (Math.pow(1+r_over_1200, m))
                                     / (Math.pow(1+r_over_1200, m)-1));

        double totInterest = mp * m;

        System.out.printf("My monthly payments will be $%.2f\n", mp);
        System.out.printf("The total interest paid is $%.2f\n", totInterest);
        System.out.printf("The total amount paid is $%.2f\n", totInterest + p);
    }
}

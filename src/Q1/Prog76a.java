package Q1;
import java.util.*;

public class Prog76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your least favorite number: ");
        int lfn = input.nextInt();
        int step1 = lfn * 9;
        int step2 = step1 * 12345679;
        System.out.println(lfn + " x 9 = " + step1);
        System.out.println(step1 + " x 12345679 = " + step2);
    }
}

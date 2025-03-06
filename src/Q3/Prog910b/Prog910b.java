package Q3.Prog910b;
import java.util.*;

public class Prog910b {
    public static String recBaseChange(int num, int base) {
        String hex = "123456789ABCDEF";
        if (num == 0) {
            return "";
        } else if (num%base-1 >= 0) {
            return recBaseChange(num/base, base) + hex.substring(num%base-1, num%base);
        } else return recBaseChange(num/base, base) + "0";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("\nEnter a number in base 10: ");
            int n = input.nextInt();
            System.out.print("Enter a base: ");
            int b = input.nextInt();
            System.out.print("The number " + n + " in base " + b + " is " + recBaseChange(n, b));
        }

    }


}

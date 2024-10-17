package Q1.Prog88aCl;
import java.util.Scanner;

public class Prog88aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = input.nextInt();
        System.out.println("Enter num2: ");
        int num2 = input.nextInt();

        Cl88a moreMath = new Cl88a(num1, num2);
        moreMath.calc();
        System.out.print(moreMath);
    }
}
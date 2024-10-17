package Q1.Prog93aCl;
import java.util.Scanner;

public class Prog93aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter kwh: ");
        int kwh = input.nextInt();
        Cl93a thing = new Cl93a(kwh);
        System.out.println(thing);
    }
}

package Q1.Prog54cCl;
import java.util.Scanner;

public class Prog54cCl {
    public static void main(String[] args) {
        System.out.print("Enter radius of the circle: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        Cl54c hi = new Cl54c(radius);
        hi.calc();
        System.out.println(hi);
    }
}

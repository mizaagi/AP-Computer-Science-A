package Q1;
import java.util.*;

public class Prog54c {
    public static void main(String[] args) {
        final double PI = 3.14159;
        System.out.println("Enter radius: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double circum = 2*PI*radius;
        double area = PI*(Math.pow(radius, 2));
        System.out.println("Circumference: " + circum);
        System.out.println("Area: " + area);
    }
}

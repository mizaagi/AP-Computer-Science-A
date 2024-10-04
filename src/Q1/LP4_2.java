package Q1;
import java.util.*;

public class LP4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in kg: ");
        double weight;
        weight = input.nextDouble();
        System.out.println("Enter length in cm: ");
        double length;
        length = input.nextDouble();
        System.out.println("Enter width in cm: ");
        double width;
        width = input.nextDouble();
        System.out.println("Enter height in cm: ");
        double height;
        height = input.nextDouble();
        double volume = length * width * height;

        if (volume > 100000 && weight > 27) {
            System.out.println("Package is too heavy and too large.");
        } else if (volume > 100000) {
            System.out.println("Package is too large.");
        } else if (weight > 27) {
            System.out.println("Package is too heavy.");
        } else {
            System.out.println("Success!");
        }

    }
}

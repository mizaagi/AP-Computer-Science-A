package Q1;
import java.util.Scanner;

public class LP4_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double rectLength;
        double rectWidth;
        double rectHeight;
        System.out.println("Rectangular Prism");
        System.out.print("Enter the length: ");
        rectLength = input.nextDouble();
        System.out.print("Enter the width: ");
        rectWidth = input.nextDouble();
        System.out.print("Enter height: ");
        rectHeight = input.nextDouble();
        System.out.println("Volume: " + (rectLength * rectWidth * rectHeight));

        double radius;
        System.out.println("\nSphere");
        System.out.print("Enter the radius: ");
        radius = input.nextDouble();
        System.out.println("Volume: " + ((Math.PI * Math.pow((2*radius), 3) ) / 6));

        double sideLength;
        System.out.println("\nCube");
        System.out.print("Enter the length of each side: ");
        sideLength = input.nextDouble();
        System.out.println("Volume: " + Math.pow(sideLength, 3));
    }
}

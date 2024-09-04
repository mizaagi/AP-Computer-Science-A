package Q1;
import java.util.*;

public class Prog54a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // int, double, boolean, String
        System.out.print("Enter the car model: ");
        String model = keyboard.nextLine();

        System.out.print("Enter miles driven: ");
        int miles = keyboard.nextInt();
        // double miles = keyboard.nextDouble;

        System.out.print("Enter gallons used: ");
        int gallons = keyboard.nextInt();

        double mpg = miles / (double)gallons;
        System.out.print("MPG used by " + model + " is " + mpg + "m/g");
    }
}
/*
Enter the car model: 1990 Ford Pinto
Enter miles driven: 1000000
Enter gallons used: 193
MPG used by 1990 Ford Pinto is 5181.347150259067m/g
 */
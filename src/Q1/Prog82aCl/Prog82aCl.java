package Q1.PRog82aCl;
import java.util.Scanner;

public class Prog82aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed limit: ");
        int speedLimit = input.nextInt();
        System.out.print("Enter vehicle speed: ");
        int vehicleSpeed = input.nextInt();

        Cl82a ticket = new Cl82a(speedLimit, vehicleSpeed);
        ticket.calc();
        System.out.println(ticket);
    }
}

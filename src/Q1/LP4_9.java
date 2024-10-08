package Q1;
import java.util.Scanner;

public class LP4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rn = ((int)(Math.random()  * 20) + 1);
        System.out.print("Enter a number between 1 and 20: ");
        int pn = input.nextInt();
        System.out.println("Computer's Secret Number: " + rn);
        System.out.println("Your Secret Number: " + pn);
        if (rn == pn) {
            System.out.println("You Win!!!");
        } else System.out.println("Better Luck Next Time");
    }
}
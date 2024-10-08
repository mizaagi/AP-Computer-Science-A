package Q1;
import java.util.Scanner;

public class LP4_6 {
    public static void doStuff(int symbol, int num1, double num2) {
        Scanner input = new Scanner(System.in);
        double userInput = 0;
        if (symbol == 1) {
            System.out.print("What is " + num1 + " + " + num2 + "? ");
            userInput = input.nextDouble();
            if (userInput == num1 + num2) {
                System.out.println("You got it!");
            } else {
                System.out.println("Nope, that's not it.");
            }
        } else if (symbol == 2) {
            System.out.print("What is " + num1 + " - " + num2 + "? ");
            userInput = input.nextDouble();
            if (userInput == num1 - num2) {
                System.out.println("You got it!");
            } else {
                System.out.println("Nope, that's not it.");
            }
        } else if (symbol == 3) {
            System.out.print("What is " + num1 + " * " + num2 + "? ");
            userInput = input.nextDouble();
            if (userInput == num1 * num2) {
                System.out.println("You got it!");
            } else {
                System.out.println("Nope, that's not it.");
            }
        } else if (symbol == 4) {
            System.out.print("What is " + num1 + " / " + num2 + "? ");
            userInput = input.nextDouble();
            if (userInput == num1 / num2) {
                System.out.println("You got it!");
            } else {
                System.out.println("Nope, that's not it.");
            }
        }
    }

    public static void main(String[] args) {
        int userInput = 0;
        int symbol = ((int)(Math.random() * 4) + 1);
        int num1 = ((int)(Math.random() * 10) + 1);
        double num2 = (double)((int)(Math.random() * 10) + 1);
        doStuff(symbol,num1,num2);
    }
}

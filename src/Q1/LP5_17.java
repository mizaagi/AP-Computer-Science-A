package Q1;
import java.util.Scanner;

public class LP5_17 {
    public static void main(String[] args) {
        String secretPassword = "iloveAP";
        Scanner input = new Scanner(System.in);
        String userInput = "";
        boolean isCorrect = false;
        for (int lcv = 0; lcv < 3; lcv++) {
            System.out.print("Enter password: ");
            userInput = input.nextLine();
            if (userInput.equals(secretPassword)) {
                isCorrect = true;
                System.out.println("Correct! Entering now.");
                break;
            }
        }
        if (!isCorrect) {
            System.out.println("Access Denied.");
        }

    }
}

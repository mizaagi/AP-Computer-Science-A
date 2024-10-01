package Q1;
import java.util.Scanner;

public class Prog72t {
    public static void main(String[] args) {
        System.out.println("Enter first time: ");
        Scanner input = new Scanner(System.in);
        int time1 = input.nextInt();
        System.out.println("Enter second time: ");
        int time2 = input.nextInt();
        int dif = Math.abs(time1 - time2);
        int hrs = 0;
        int mins = 0;
        while (dif >= 100) {
            dif -= 100;
            hrs += 1;
        }
        if (dif >= 60) {
            mins = dif - 40;
        } else {
            mins = dif;
        }

        System.out.println(hrs + " hours and " + mins + " minutes");
    }
}

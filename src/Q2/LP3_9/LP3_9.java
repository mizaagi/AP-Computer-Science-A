package Q2.LP3_9;
import java.util.Scanner;

public class LP3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int by = input.nextInt();
        int bm = input.nextInt();
        int bd = input.nextInt();
        int y  = input.nextInt();
        int m  = input.nextInt();
        int d  = input.nextInt();
        ClLP3_9 sad = new ClLP3_9(by, bm, bd, y, m, d);
        sad.calc();
        System.out.println(sad.getDays());
        System.out.println(sad.getHours());
    }


    // 1997 2 12 2012 8 3
    // You have been alive 5646 days
    // You have slept 45168 hours
}

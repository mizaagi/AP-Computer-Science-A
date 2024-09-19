package Q1;
import java.util.*;

public class Prog82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Speed Limit: ");
        int speed = input.nextInt();
        System.out.print("Enter Vehicle Speed: ");
        int vehicle = input.nextInt();
        int wow = vehicle - speed;
        int huh = wow * 5;
        int cat = 20 + huh;
        System.out.println("Fine: $" + cat);
    }
}

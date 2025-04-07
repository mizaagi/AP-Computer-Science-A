package Q3.MSOE;
import java.util.*;

public class msoe2019_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first letter: ");
        String c1 = input.nextLine();
        System.out.print("Enter second letter: ");
        String c2 = input.nextLine();
        System.out.println("Enter line of text: ");
        String line = input.nextLine();
        int count = 0;
        for (int i = 0; i < line.length()-1; i++) {
            if (line.substring(i, i+2).equals(c1 + c2) || line.substring(i, i+2).equals(c2 + c1)) count++;
        }
        System.out.println(count);
    }
}

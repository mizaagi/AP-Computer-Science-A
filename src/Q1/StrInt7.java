package Q1;
import java.util.Scanner;

public class StrInt7 {
    public static void main(String[] args) {
        Scanner cool = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String myText = cool.nextLine().toLowerCase().trim();
        int vCount = 0;
        int cCount = 0;
        for (int lcv = 0; lcv < myText.length(); lcv++) {
            char cur = myText.charAt(lcv);
            if (cur == 'a' || cur == 'e' || cur == 'i' || cur == 'o' || cur == 'u')
                vCount++;
            else if (cur != ' ') cCount++;
        }
        System.out.printf("# Vowels: %d\t\t# Consonants: %d\n", vCount, cCount);
    }
}

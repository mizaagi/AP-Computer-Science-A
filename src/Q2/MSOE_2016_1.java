package Q2;
import java.util.Scanner;

public class MSOE_2016_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String reversedWord = "";
        for (int i = word.length(); i > 0; i--) {
            reversedWord += word.substring(i-1, i);
        }
        System.out.println("Is the word a palindrome? " + (word.equals(reversedWord)));
    }
}

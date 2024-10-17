package Q1.Prog76aCl;
import java.util.Scanner;

public class Prog76aCl {
    public static void main(String[] args) {
        System.out.print("Enter a number you dislike: ");
        Scanner input = new Scanner(System.in);
        int hatedNum = input.nextInt();
        Cl76a haha = new Cl76a(hatedNum);
        haha.calc();
        System.out.println(haha);
    }
}
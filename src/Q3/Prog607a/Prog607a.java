package Q3.Prog607a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog607a {
    public static void main(String[] args) {
        boolean keepGoing = true;
        Scanner input = new Scanner(System.in);
        System.out.println("---menu---");
        System.out.println("0) Quit");
        System.out.println("1) Encode Date");
        System.out.println("2) Decode Date");
        while (keepGoing) {
            System.out.print("Select an option: ");
            int num = input.nextInt();
            if (num == 0)
                keepGoing = false;
            else if (num == 1) {
                System.out.print("Enter date: ");
                EncodeDecode ed = new EncodeDecode(input.next(), "date");
                ed.encode();
                System.out.println(ed.getEncoded());
            } else if (num == 2) {
                System.out.print("Enter code: ");
                EncodeDecode ed = new EncodeDecode(input.next(), "code");
                ed.decode();
                System.out.println(ed.getDecoded());
            }
        }
    }
}


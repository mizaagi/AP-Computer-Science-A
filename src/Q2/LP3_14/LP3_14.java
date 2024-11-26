package Q2.LP3_14;
import java.util.Scanner;

public class LP3_14 {
    public static void main(String[] args) {
        int any, mny, anj, mnj, act, mct;
        Scanner input = new Scanner(System.in);
        System.out.println("Election Results for New York:");
        System.out.print("Awbrey: ");
        any = input.nextInt();
        System.out.print("Martinez: ");
        mny = input.nextInt();
        System.out.println("Election Results for New Jersey:");
        System.out.print("Awbrey: ");
        anj = input.nextInt();
        System.out.print("Martinez: ");
        mnj = input.nextInt();
        System.out.println("Election Results for Connecticut");
        System.out.print("Awbrey: ");
        act = input.nextInt();
        System.out.print("Martinez: ");
        mct = input.nextInt();

        ClLP3_14 electionCalculator = new ClLP3_14(any, mny, anj, mnj, act, mct);
        electionCalculator.calc();
        System.out.println(electionCalculator);
    }
}

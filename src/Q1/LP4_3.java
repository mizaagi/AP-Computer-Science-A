package Q1;
import java.util.*;


public class LP4_3 {
    public static double getTotal(double x, int dozens, int spares) {
        double newTotal = (dozens * x) + (spares * (x / 12));
        System.out.println("The total price is $" + newTotal);
        return newTotal;
    }

    public static void main(String[] args) {
        int eggs = 0;
        System.out.println("Enter the number of eggs you are purchasing: ");
        Scanner input = new Scanner(System.in);
        eggs = input.nextInt();
        int dozens = eggs / 12;
        int spares = eggs % 12;
        double price = 0.0;
        double total = 0.0;

        if (eggs >= 0 && eggs < 48) {
            getTotal(0.5, dozens, spares);
        } else if (eggs >= 48 && eggs < 72) {
            getTotal(0.45, dozens, spares);
        } else if (eggs >= 72 && eggs < 132) {
            getTotal(0.4, dozens, spares);
        } else if (eggs >= 132) {
            getTotal(0.35, dozens, spares);
        }
    }
}

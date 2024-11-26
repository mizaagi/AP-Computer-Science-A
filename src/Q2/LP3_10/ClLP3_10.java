package Q2.LP3_10;
import java.util.Scanner;

public class ClLP3_10 {
    private int burgers;
    private int fries;
    private int sodas;
    private double subtot;
    private double tax;
    private double fintot;
    private double tender;
    private double change;

    public ClLP3_10(int b, int f, int s) {
        this.burgers = b;
        this.fries   = f;
        this.sodas   = s;
        this.subtot  = 0;
        this.tax     = 0;
        this.fintot  = 0;
        this.change  = 0;
    }

    public void calc() {
        this.subtot = (burgers * 1.69) + (fries * 1.09) + (sodas * 0.99);
        this.tax    = subtot * 0.065;
        this.fintot = subtot + tax;
    }

    public void calc_tender(double t, double p) {
        this.change = t - p;
    }

    public String toString() {
        return "\nSubtotal: $" + subtot + "\nTax: $" + tax + "\nTotal: $" + fintot + "\n";
    }

    public String getChangeString() {
        return "Your change is " + change;
    } 
}

package Q1.Prog88aCl;

public class Cl88a {
    private int num1;
    private int num2;
    private int sum;
    private int dif;
    private int prod;
    private int dist;
    private double avg;
    private int max;
    private int min;

    public Cl88a(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.sum = 0;
        this.dif = 0;
        this.prod = 0;
        this.dist = 0;
        this.avg = 0;
        this.max = 0;
        this.min = 0;
    }

    public void calc() {
        sum = num1 + num2;
        dif = num1 - num2;
        prod = num1 * num2;
        dist = abs(num1 - num2);
        avg = sum/2.0;
        if (num1 >= num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
    }

    public String toString() {
        return "\nSum = " + sum +
               "\nDifference = " + dif +
               "\nProduct = " + prod +
               "\nAverage = " + avg +
               "\nDistance = " + dist +
               "\nMaximum = " + max +
               "\nMinimum = " + min;
    }
}
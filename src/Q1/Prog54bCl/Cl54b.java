package Q1.Prog54bCl;

public class Cl54b {
    private int a;
    private int b;
    private int c;
    private int d;
    private double avg;
    private int sum;

    public Cl54b(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.avg = 0;
        this.sum = 0;
    }

    public void calc() {
        sum = a+b+c+d;
        avg = sum / 4.0;
    }

    public String toString() {
        return "The sum of the numbers is " + sum +
                "\n\nThe average of the numbers is " + avg;
    }
}
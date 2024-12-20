package Q2.Prog215h;

import java.util.Arrays;

public class Cl215h {
    private double[] scores;
    private int number;
    private double avg;

    public Cl215h(int n, double[] s) {
        this.number = n;
        this.scores = s;
        this.avg = 0;

    }

    public void calc() {
        for (double x : scores) {
            this.avg += x;

        }
        this.avg /= 8;

    }

    public double getAvg() {
        return this.avg;
    }
    public String toString() {
        return "Contestant " + number + "\n" + Arrays.toString(scores) + " = " + avg + "\n";
    }
}

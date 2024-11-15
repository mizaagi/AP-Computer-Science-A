package Q2.Prog402a;

public class Cl402a {
    private int id;
    private int score;
    private double diff;

    public Cl402a(int i, int s) {
        this.id = i;
        this.score = s;
        this.diff = 0;
    }

    public int getScore() {
        return score;
    }

    public double getDiff() {
        return diff;
    }

    public void calc(double avg) {
        diff = score - avg;
    }

    public String toString() {
        return id + "\t" + score + "\t\t" + diff;
    }
}

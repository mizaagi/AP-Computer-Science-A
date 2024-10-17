 package Q1.Prog76aCl;

public class Cl76a {
    private int inNum;
    private int outNum;

    public Cl76a(int inNum) {
        this.inNum = inNum;
        this.outNum = 0;
    }

    public void calc() {
        outNum = inNum * 9 * 12345679;
    }

    public String toString() {
        return inNum + "\nx 9\n________\n"
                     + (inNum*9) + "\nx 12345679\n_________"
                     + outNum + "\n\nSurprise!";
    }
}
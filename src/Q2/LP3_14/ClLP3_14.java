package Q2.LP3_14;

public class ClLP3_14 {
    private int awbNY;
    private int mrcNY;
    private int awbNJ;
    private int mrcNJ;
    private int awbCT;
    private int mrcCT;
    private double awbTot;
    private double mrcTot;
    private double awbPct;
    private double mrcPct;

    public ClLP3_14(int any, int mny,
                    int anj, int mnj,
                    int act, int mct) {
        this.awbNY = any;
        this.mrcNY = mny;
        this.awbNJ = anj;
        this.mrcNJ = mnj;
        this.awbCT = act;
        this.mrcCT = mct;
        this.awbTot = 0;
        this.mrcTot = 0;
        this.awbPct = 0;
        this.mrcPct = 0;
    }

    public void calc() {
        this.awbTot = awbNY + awbNJ + awbCT;
        this.mrcTot = mrcNY + mrcNJ + mrcCT;
        this.awbPct = (awbTot / (awbTot+mrcTot)) * 100;
        this.mrcPct = (mrcTot / (awbTot+mrcTot)) * 100;
    }

    public String toString() {
        return "Candidate\t\tVotes\t\tPercentage\n" +
                "Awbrey\t\t" + awbTot + "\t" + awbPct + "%\n" +
                "Martinez\t\t" + mrcTot + "\t" + mrcPct + "%\n";
    }
}

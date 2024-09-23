package Q1;

public class Prog122b {
    public static void main(String[] args) {
        System.out.println("Hours\tPay");
        int lcv = 1;
        int fourlcv = 0;
        while (lcv < 41) {
            fourlcv = lcv * 4;
            System.out.println(lcv+"\t\t"+fourlcv);
            lcv++;
        }
    }
}

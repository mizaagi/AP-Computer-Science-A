package Q1;

public class Prog122c {
    public static void main(String[] args) {
        int lcv = 2;
        int add = 0;
        int mult = 0;
        double exp = 0;
        while (lcv < 11) {
            add = lcv+1;
            mult = lcv*2;
            exp = Math.pow(lcv, 2);
            System.out.println(lcv+"\t"+add+"\t"+mult+"\t"+(int)exp);
            lcv += 2;
        }
    }
}

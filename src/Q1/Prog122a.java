package Q1;

public class Prog122a {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tSquare Root");
        int lcv = 0;
        while (lcv < 51) {
            System.out.println(lcv+"\t\t"+Math.pow(lcv, 2)+"\t\t"+Math.sqrt(lcv));
            lcv++;
        }
    }
}

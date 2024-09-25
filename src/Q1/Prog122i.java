package Q1;

public class Prog122i {
    public static void main(String[] args) {
        System.out.println("Number\tCube Root\t\t\tCube");
        for (int lcv = -25; lcv < 26; lcv++) {
            if (lcv < 0) {
                System.out.println(lcv + "\t\t-" + Math.pow(Math.abs(lcv), 0.3333333) + "\t" + (int)Math.pow(lcv, 3));
            } else {
                System.out.println(lcv + "\t\t" + Math.pow((lcv), 0.3333333) + "\t" + (int)Math.pow(lcv, 3));
            }
        }
    }
}
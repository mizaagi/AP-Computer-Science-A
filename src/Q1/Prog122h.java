package Q1;

public class Prog122h {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tSquare Root\tCube\t4th Root");
        int lcv = 0;
        double square = 0;
        double sqrt = 0;
        double cube = 0;
        double fourth = 0;
        while (lcv < 21) {
            lcv++;
            square = Math.round((Math.pow(lcv, 2) * 1000.0)) / 1000.0;
            sqrt = Math.round((Math.sqrt(lcv) * 1000.0)) / 1000.0;
            cube = Math.round((Math.pow(lcv, 3) * 1000.0)) / 1000.0;
            fourth = Math.round((Math.pow(lcv, 0.25) * 1000.0)) / 1000.0;
            System.out.println(lcv+"\t\t"+square+"\t\t"+sqrt+"\t\t"+cube+"\t\t"+fourth);
        }
    }
}

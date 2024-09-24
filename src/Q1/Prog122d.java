package Q1;

public class Prog122d {
    public static void main(String[] args) {
        double lcv = -12.0;
        double result = 0.0;
        while (lcv < 17) {
            result = (Math.pow(lcv,6)-(3*Math.pow(lcv,5))-
                    (93*Math.pow(lcv,4))+(87*Math.pow(lcv,3))+(1596*Math.pow(lcv,2))-(1380*lcv)-2800);
            System.out.println(lcv+"\t\t"+result);
            lcv++;
        }
    }
}

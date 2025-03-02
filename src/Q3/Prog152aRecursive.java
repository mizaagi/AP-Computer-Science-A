package Q3;



public class Prog152aRecursive {
    public static int sumRec(int n) {
        if (n == 3) {
            return n;
        } else {
            return n + sumRec(n-3);
        }
    }


    public static void main(String[] args) {
        System.out.println("The sum of the multiples of 3, from 3 to 9669 is " + sumRec(9669));
    }
}
package Q1;

public class Prog166f {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 110;
        int n3 = 0;
        int sum = 1;
        while (n3 < 111) {
            while (n1 < 101) {
                n1++;
                sum+=(n1*n2);
                n2--;
            }
            n3++;
            System.out.println(sum);
        }
    }
}

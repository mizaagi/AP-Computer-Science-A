package Q1;

public class mathtest {
    public static void main(String[] args) {
        int twocubed = (int)Math.pow(2, 3); // 2^3

        int num1 = 5;
        int num2 = 6;
        int num3 = 7;
        int sum = num1+num2+num3;
        sum /= 3;

        num1 = num1 + 1;
        num1 += 1;
        num1++;

        int test = 3/4; // equals 0 because of IDIOTIC STUPID integer division, need a double.

        final double PI = 3.14159;

        double myWallet = 5832.2039857235;
        double myWalletRounded = Math.round(myWallet * 100.0) / 100.0;

        System.out.printf("myWalletRounded = %.2f\n", myWallet); // %.#f
    }
}

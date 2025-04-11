package Q3.MSOE;
import java.util.*;

public class msoe2022_5 {
    public static void main(String[] args) {
        int currentBucket = 0;
        int totalBuckets = 0;
        Scanner input = new Scanner(System.in);
        boolean crazy = true;
        while (crazy) {
            int more = input.nextInt();
            if (more == 0) {
                crazy = false;
            }
            if (more == 100) {
                totalBuckets++;
            } else {
                currentBucket += more;
                if (currentBucket >= 100) {
                    currentBucket -= 100;
                    totalBuckets++;
                }
            }
        }
        if (currentBucket > 0)
            totalBuckets++;
        System.out.println(totalBuckets);
    }
}

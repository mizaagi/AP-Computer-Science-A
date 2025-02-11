package Q2;

public class imRight {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int avg = 0;
        int[] nums = new int[] {5, 7, 9};
        while (count != nums.length) {
            sum = sum + nums[count];
            count++;
            avg = sum / count;
        }
        System.out.println(avg);
    }
}

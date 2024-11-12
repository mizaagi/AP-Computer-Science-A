package Q2;

public class BigArray {
    public static void main(String[] args) {
        int[] array = new int[19];
        for (int lcv = 0; lcv < array.length; lcv++)
            array[lcv] = (int) (Math.random() * (91 - 20) + 20); // random * (max-min) + min

        // Step 1. print the array from start to finish
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        // Step 2. print the array from start to finish using a for-each loop
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();

        // Step 3. what number is in the middle of the array?
        System.out.println("The middle number is " + array[array.length/2]);

        // Step 4. what is the average of the first, last, and middle numbers?
        double avg = array[0] + array[array.length-1] + array[array.length/2];
        System.out.println("Average of first, middle, and last numbers is: " + (avg/3));

        // Step 5. find the smallest and the largest number in the array
        int smallest = array[0];
        int largest = array[0];
        for (int i : array) {
            if (i < smallest) smallest = i;
            if (i > largest)  largest = i;
        }
        System.out.println("Biggest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        // Step 6. switch the largest with the smallest number. print the list.
        int smallIndex = -1;
        int largeIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) smallIndex = i;
            if (array[i] == largest) largeIndex = i;
        }

        int tempswap = array[smallIndex];
        array[smallIndex] = array[largeIndex];
        array[largeIndex] = tempswap;

        for (int x : array)
            System.out.print(x + " ");
        System.out.println();

        // Step 7. create a new random from 1 to 10 and insert it in the middle slot. print the numbers.
        int rand = (int) (Math.random() * 10 + 1);
        array[array.length/2] = rand;

        for (int x : array)
            System.out.print(x + " ");
        System.out.println();

        // Step 8. add 10 to every number in the list. print all.
        for (int i = 0; i < array.length; i++)
            array[i] += 10;
        for (int x : array)
            System.out.print(x + " ");
        System.out.println();

        // Step 9. replace the 3rd element in the array with 5 and print the number that was ousted
        int myThird = array[2];
        array[2] = 5;
        System.out.println("The number that was ousted is " + myThird);

        // Step 10. what numbers are in the 50s?
        for (int num : array) {
            if (num >= 50 && num <= 59)
                System.out.print(num + " ");
            System.out.println();
        }

        // Step 11. what numbers are divisible by 4?
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 4 == 0)
                System.out.print(array[i] + " ");
        }
        System.out.println();

        // Step 12. is there a 60 in the list?
        boolean sixty = false;
        for (int n: array)
            if (n == 60) sixty = true;
        System.out.println("Is 60 in the list: " + sixty);

        // Step 13. check to see if all of the elemnts from front to back are in the same order from back to front
        boolean same = true;
        for (int lcv = 0; lcv < array.length; lcv++)
            if (array[lcv] != array[array.length-1] - lcv)
                same = false;
        System.out.println("Is the array palindromic: " + same);


        // Step 14. how many numbers are greater than the average?
        avg = 0;
        for (int x : array) avg += x;
        avg /= array.length;

        int avgCount = 0;
        for (int x : array)
            if (x > avg) avgCount++;
        System.out.printf("There are %d numbers greater than the average\n", avgCount);

        // Step 15. how many of the numbers are even?
        int evens = 0;
        for (int num : array)
            if (num % 2 == 0) evens++;
        System.out.printf("There are %d even numbers\n", evens);

        // Step 16. copy all of the elements of the array into a new array but in reverse order
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++)
            array2[i] = array[(array.length-1) - i];

        for (int n : array2)
            System.out.print(n + " ");
        System.out.println();

        // Step 17. write a program to shift every element of an array circularly right.
        int[] shiftArray = circularShiftRight(array);

        // Step 18. find the sum of all of the digits of all of the elements
        int sum = 0;
        for (int num : array) {
            int digitsum = 0;
            int temp = num;
            while (temp > 0) {
                int n = temp % 10;
                temp /= 10;
                digitsum += n;
            }
            sum += digitsum;
        }
        System.out.println("Sum of all digits of all elements: " + sum);
    }

    public static int[] circularShiftRight(int[] arr) {
        int temp = arr[arr.length - 1];
        int[] shifted = new int[arr.length];
        for (int i = 1; i < arr.length; i++)
            shifted[i] = arr[i-1];
        shifted[0] = temp;
        return shifted;
    }
}

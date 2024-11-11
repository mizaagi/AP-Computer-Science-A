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
    }
}

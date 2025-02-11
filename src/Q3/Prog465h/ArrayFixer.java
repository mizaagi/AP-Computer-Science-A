package Q3.Prog465h;

public class ArrayFixer {
    int rows;
    int cols;
    int[][] array;
    int[][] newArray;

    public ArrayFixer(int[][] arr, int r, int c) {
        rows = r;
        cols = c;
        array = arr;
        if (shouldBeReduced() >= 1)
            newArray = new int[getReducedStats()][3];
        else newArray = new int[0][0];
    }

    public int shouldBeReduced() {
        int nonZeros = 0;
        int zeros = 0;
        for (int[] mat : array) {
            for (int i : mat) {
                if (i == 0) zeros++;
                else nonZeros++;
            }
        }
        // if it shouldn't be reduced, return 0
        if (zeros < nonZeros) return 0;
        // if it should be reduced, return 1
        if (zeros > nonZeros) return 1;
        // else return 2 if they are the same level of efficiency
        return 2;
    }

    private int getReducedStats() {
        int x = 0;
        for (int[] mat : array)
            for (int i : mat)
                if (i != 0) x++;
        return x;
    }

    public void calcReduced() {
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] != 0 && count < cols) {
                    newArray[count][0] = i;
                    newArray[count][1] = j;
                    newArray[count][2] = array[i][j];
                    if (count < cols-1)
                        count++;
                }
            }
        }
    }

    public void printFormattedReduced() {
        for (int[] mat : newArray) {
            if (mat[2] == 0) continue;
            for (int i : mat) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void printFormattedNormal() {
        for (int[] mat : array) {
            for (int i : mat) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

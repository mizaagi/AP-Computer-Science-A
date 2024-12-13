package Q2.ArrayListLab;

public class CLALL {
    private int[] myArray;
    private int mySize;
    private int myCapacity;
    private final int DEFAULT_SIZE = 16;

    public CLALL() {
        myArray = new int[DEFAULT_SIZE];
        mySize = 0;
        myCapacity = DEFAULT_SIZE;
    }

    private void doubleCapacity() {
        myCapacity *= 2;
        int[] temp = new int[myCapacity];
        for (int i = 0; i < mySize; i++) {
            temp[i] = myArray[i];
        }
        myArray = temp;
    }

    private void halfCapacity() {
        myCapacity /= 2;
        int[] temp = new int[myCapacity];
        for (int i = 0; i < mySize; i++) {
            temp[i] = myArray[i];
        }
        myArray = temp;
    }

    public void add(int num) {
        if (mySize + 1 == myCapacity) doubleCapacity();
        myArray[mySize] = num;
        mySize++;
    }

    public void remove(int index) {
        for (int i = index + 1; i < mySize; i++) {
            myArray[i - 1] = myArray[i];
        }
        mySize--;
        if (mySize <= (myCapacity * 0.25)) halfCapacity();
    }

    public int get(int index) { return myArray[index]; }

    public void set(int index, int num) { myArray[index] = num; }

    public int size() { return mySize; }

    public int[] toArray() { return myArray; }

    public int indexOf(int num) {
        for (int i = 0; i < mySize; i++) {
            if (myArray[i] == num) return i;
        }
        return -1;
    }
}

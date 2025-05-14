package Q4.LibraryManagementLab;

public class BinarySearchUtil {
    // TODO: Implement binary search method (takes in ArrayList) using recursion for searching books by title (required) or author
    static int binarySearch(int a[], int l, int r, int x)
    {

        if (r >= l) {
            int m = l + (r - l) / 2;

            // Returned Index of the Element
            if (a[m] == x)
                return m;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (a[m] > x)
                return binarySearch(a, l, m - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(a, m + 1, r, x);
        }

        // No Element Found
        return -1;
    }
}

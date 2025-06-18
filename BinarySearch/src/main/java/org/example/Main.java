package org.example;

public class Main {
    static int binarySearch(int[] arr, int left, int right, int x)
    {
        while (left <= right) {
            int mid = (left + right) / 2;

            // Index of Element Returned
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // No Element Found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;

        int res = binarySearch(arr, 0, n - 1, x);

        System.out.println("Element to be searched is : "+ x);

        if (res == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index: " + res);
    }
}
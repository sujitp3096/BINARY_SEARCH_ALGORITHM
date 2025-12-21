import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    // Method to perform Binary Search
    static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // Binary search requires sorted array

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, key);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");

        sc.close();
    }
}

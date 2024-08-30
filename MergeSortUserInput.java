package MergeSort;
import java.util.Scanner;

public class MergeSortUserInput {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to hold the elements
        int[] array = new int[n];

        // Get the elements from the user
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Perform merge sort
        mergeSort(array, 0, array.length - 1);

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Recursive method to perform merge sort
    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Sort the left half
            mergeSort(array, left, middle);

            // Sort the right half
            mergeSort(array, middle + 1, right);

            // Merge the sorted halves
            merge(array, left, middle, right);
        }
    }

    // Method to merge two halves
    private static void merge(int[] array, int left, int middle, int right) {
        // Calculate the sizes of the two subarrays
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temporary arrays to hold the data
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to the temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = array[middle + 1 + i];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left array
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right array
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

import java.util.*;

public class Novillos_OE6 {
    private static final int THRESHOLD = 10; // threshold for switching to insertion sort

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an input method: ");
        System.out.println("1. Input array elements");
        System.out.println("2. Generate random array elements");
        int inputMethod = scanner.nextInt();

        int[] arr;

        switch (inputMethod) {
            case 1:
                System.out.print("Enter the size of the array: ");
                int n = scanner.nextInt();

                arr = new int[n];

                System.out.println("Enter the elements of the array: ");
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }
                break;
            case 2:
                System.out.print("Enter the size of the array: ");
                int m = scanner.nextInt();

                arr = new int[m];

                // generate random input
                Random random = new Random();
                for (int i = 0; i < m; i++) {
                    arr[i] = random.nextInt(100);
                }
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Before sorting: " + Arrays.toString(arr));

        // allow the user to choose between hybrid quicksort and standard quicksort
        System.out.println("Choose a sorting algorithm: ");
        System.out.println("1. Hybrid Quicksort");
        System.out.println("2. Standard Quicksort");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                hybridQuicksort(arr, 0, arr.length - 1);
                break;
            case 2:
                Arrays.sort(arr);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        System.out.println("After sorting: " + Arrays.toString(arr));
    }

    private static void hybridQuicksort(int[] arr, int left, int right) {
        if (left < right) {
            if (right - left <= THRESHOLD) {
                // switch to insertion sort for small subarrays
                insertionSort(arr, left, right);
            } else {
                // partition the array using a random pivot
                int pivotIndex = partition(arr, left, right);
                // recursively sort the left and right subarrays
                hybridQuicksort(arr, left, pivotIndex - 1);
                hybridQuicksort(arr, pivotIndex + 1, right);
            }
        }
    }

    private static int partition(int[] arr, int left, int right) {
        // choose a random pivot
        int pivotIndex = left + (int)(Math.random() * (right - left + 1));
        int pivotValue = arr[pivotIndex];
        // move the pivot to the end of the array
        swap(arr, pivotIndex, right);
        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (arr[i] < pivotValue) {
                swap(arr, i, storeIndex);
                storeIndex++;
            }
        }
        // move the pivot back to its final position
        swap(arr, storeIndex, right);
        return storeIndex;
    }

    private static void insertionSort(int[] arr, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= left && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
            }
            arr[j + 1] = key;
        }
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}    
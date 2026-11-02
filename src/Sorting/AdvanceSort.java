
import java.util.Random;

public class AdvanceSort {

    static Random rand = new Random();

    // Quick Sort function
    static void quickSort(int arr[], int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            // Sort left part
            quickSort(arr, low, pivotIndex - 1);

            // Sort right part
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition function with Random Pivot
    static int partition(int arr[], int low, int high) {

        // Select a random index
        int randomIndex = low + rand.nextInt(high - low + 1);

        // Swap random element with last element
        int temp = arr[randomIndex];
        arr[randomIndex] = arr[high];
        arr[high] = temp;

        // Select pivot
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {

                i++;

                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

        // Place pivot in correct position
        int t = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = t;

        return i + 1;
    }

    public static void main(String[] args) {

        int arr[] = {10, 7, 8, 9, 1, 5};

        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

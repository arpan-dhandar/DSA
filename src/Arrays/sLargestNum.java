package Arrays;

import java.util.Arrays;

public class sLargestNum {
    static int brute(int[] arr) {

        Arrays.sort(arr);
        int largestNum = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < largestNum) {
                return arr[i];
            }
        }
        return -1;
    }

    static int better(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        int secondLargest = -1;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < largest && arr[j] > secondLargest) {
                secondLargest = arr[j];
            }
        }
        return secondLargest;

    }

    public static void main(String[] args) {
        int[] arr = { 21, 45, 89, 63, 44, 28 };

        System.out.println("Brute Force: " + brute(arr.clone()));

        System.out.println("Better Approch: " + better(arr.clone()));
    }
}

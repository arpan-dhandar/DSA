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

    static int optimal(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length; i++){
            if(arr[i]> largest){
                secondLargest = largest;
                largest = arr[i];
            } else if( arr[i]> secondLargest && arr[i]< largest){
                secondLargest = arr[i];
            }
        }
        if( secondLargest == Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = { 21, 45, 89, 63, 44, 28 };

        System.out.println("Brute Force: " + brute(arr.clone()));

        System.out.println("Better Approch: " + better(arr.clone()));

        System.out.println("Optimal Approch: "+ optimal(arr.clone()));
    }
}

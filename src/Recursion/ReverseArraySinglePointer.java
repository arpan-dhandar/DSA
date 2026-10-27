package Recursion;

import java.util.Arrays;

public class ReverseArraySinglePointer {
    public static void reverse(int arr[], int i){
        int n = arr.length;
        if (i >= n/2) {
            return ;
        }

        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        reverse(arr, i+1);
    }    
public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original: " + Arrays.toString(arr));

        reverse(arr, 0);

        System.out.println("Reversed: " + Arrays.toString(arr));
    }
}

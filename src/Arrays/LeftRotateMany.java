package Arrays;

public class LeftRotateMany {

    static void brute(int[] arr, int d) {
        int n = arr.length;
        if (n == 0) return;

        d = d % n;
        if (d == 0) return;

        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    } // Added missing closing brace here

    static void optimal(int[] arr, int d) {
        int n = arr.length;
        if (n == 0) return;

        d = d % n;
        if (d == 0) return;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int d = 2;

        // Test optimal approach
        optimal(arr1, d);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        // Output: 3 4 5 1 2
    }
}
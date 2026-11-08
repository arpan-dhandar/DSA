package Arrays;

public class MoveZeros {
    static void brute(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        int j = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    static void optimal(int[] arr) {
        int n = arr.length;

        int j = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return;
        }

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 0, 2, 0, 3, 4, 0};
          int[] arr1 = {1, 0, 2, 0, 3, 4, 0};

        brute(arr);
        optimal(arr1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");    
        }
         for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
    }

    }}
package Arrays;

public class LeftRotateMany {
    static void brute(int[] arr, int d){
        int n = arr.length;

        d= d%n;

        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        for (int i =0; i < d; i++){
            arr[n-d+1] = temp[i];
        }
    }
    
}

package Arrays;

public class MoveZeros {
    static void brute(int[] arr){
         int n = arr.length;
         int[] temp = new int[n];

         int j= 0;

         for (int i = 0; i < n; i++) {
            
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
         }

         for(int i = 0; i < n; i++){
            arr[i] = temp[i];
         }
    }
    public static void main(String[] args) {
        
        int[] arr = {1, 0, 2, 0, 3, 4, 0};

        brute(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");    
        }
    }
}

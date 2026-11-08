package Arrays;

public class LinearSearch{
    static int search(int[] arr, int num){
        for(int i=0; i < arr.length; i++){
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int[] arr={1,25,14,36,98,74};

        int result = search(arr, 1);
        System.out.println(result);
    }
}
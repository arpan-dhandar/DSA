
public class InsertionSort {
   public static void main(String[] args){
       int arr[]={21,36,84,75,69};
       int n = arr.length;

       for(int i = 0; i < n; i++){
           int j =i;
           while(j > 0 && arr[j]<arr[j-1]){
               int temp = arr[j-1];
               arr[j-1]= arr[j];
               arr[j]= temp;
               j--;
           }
       }
       for(int i = 0; i <n; i++){
           System.out.print(arr[i]+" ");
       }
   }
}

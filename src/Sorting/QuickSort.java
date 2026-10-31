public class QuickSort {
    static void quickSort(int arr[], int low, int high){
        if(low<high){
            int pivotIndex = partition(arr, low, high);

            //for left
            quickSort(arr, low, pivotIndex-1);

            //for right
            quickSort(arr, pivotIndex+1, high);
        }
    }

    static int partition(int arr[], int low, int high){

        int pivot = arr[low];

        int i = low;
        int j = high;

        while(i < j){

            while(arr[i] <= pivot && i < high){
                i++;
            }
            while(arr[j]> pivot && j > low){
                j--;
            }

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {
        int arr[] = {10, 7, 8 , 9, 1, 5};

        int n = arr.length;

        quickSort(arr, 0, n-1);

        System.out.print("Sorted Array: ");

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}

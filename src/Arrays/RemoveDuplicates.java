
package Arrays;
import java.util.ArrayList;

public class RemoveDuplicates {

    static int brute(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i< arr.length; i++){

            if ( !list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        for(int i = 0; i< list.size(); i++){
            arr[i] = list.get(i);
        }
        return list.size();
    }

    static int optimal(int[] arr){
        int i = 0;

        for(int j = 1; j <arr.length; j++){
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
int[] arr = {1, 1, 2, 2, 3, 3, 4};

        int k = brute(arr);

        System.out.println("Unique elements: " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

         int l = optimal(arr);

        System.out.println("Unique elements: " + l);

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
        
    }


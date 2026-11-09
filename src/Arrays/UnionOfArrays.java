package Arrays;

import java.util.ArrayList;
import java.util.TreeSet;

public class UnionOfArrays {
    static ArrayList<Integer> brute(int[] arr1, int[] arr2){
        TreeSet<Integer> set = new TreeSet<>();

        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]); 
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        ArrayList<Integer> result = new ArrayList<>(set);

        return result;
    }

    public static void main(String[] args) {
        
        int[] arr1 = {1, 2,3,4,5,};
        int[] arr2 = {2,3,4,5,6,7};

        System.out.println(brute(arr1, arr2));
    }
}

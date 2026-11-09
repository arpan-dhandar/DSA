package Arrays;

import java.util.ArrayList;
import java.util.TreeSet;

public class UnionOfArrays {
    static ArrayList<Integer> brute(int[] arr1, int[] arr2) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        ArrayList<Integer> result = new ArrayList<>(set);

        return result;
    }

    static ArrayList<Integer> optimal(int[] arr1, int[] arr2) {
        static ArrayList<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        int n = arr1.length;
        int m = arr2.length;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {

                if (result.isEmpty() || result.get(result.size() - 1) != arr1[1]) {
                    result.add(arr1[i]);
                }
                i++;
            } else {

                if (result.isEmpty() ||
                        result.get(result.size() - 1) != arr2[j]) {

                    result.add(arr2[j]);
                }

                j++;
            }
        }
         while (i < n) {

            if (result.isEmpty() ||
                result.get(result.size() - 1) != arr1[i]) {

                result.add(arr1[i]);
            }

            i++;
        }

        while (j < m) {

            if (result.isEmpty() ||
                result.get(result.size() - 1) != arr2[j]) {

                result.add(arr2[j]);
            }

            j++;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 5, };
        int[] arr2 = { 2, 3, 4, 5, 6, 7 };

        System.out.println(brute(arr1, arr2));
        System.out.println(optimal(arr1, arr2));
    }
}


package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    // 1. Brute Force Approach
    static int brute(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                return arr[i];
            }
        }

        return -1;
    }

    // 2. Better Approach (HashMap)
    static int better(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find element appearing once
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }

    // 3. Optimal Approach (XOR)
    static int optimal(int[] arr) {

        int xor = 0;

        for (int i = 0; i < arr.length; i++) {

            xor = xor ^ arr[i];
        }

        return xor;
    }

    // Main Method
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 4, 5, 3, 4};

        System.out.println("Brute Force Answer: " + brute(arr));

        System.out.println("Better Answer: " + better(arr));

        System.out.println("Optimal Answer: " + optimal(arr));
    }
}

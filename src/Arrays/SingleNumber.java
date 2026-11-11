package Arrays;

public class SingleNumber {
    
package Arrays;

public class SingleNumber {

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

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 4, 5, 3, 4};

        System.out.println(brute(arr));
    }
}

package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    static int better(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the element appearing once
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 4, 5, 3, 4};

        System.out.println(better(arr));
    }
}

}

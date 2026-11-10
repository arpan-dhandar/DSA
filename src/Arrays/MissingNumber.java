package Arrays;

public class MissingNumber{
    public static int brute(int[] nums) {
        int n = nums.length;

        for (int i = 0; i <= n; i++) {
            boolean found = false;
            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }

    public static int better(int[] nums) {
        int n = nums.length;
        boolean[] present = new boolean[n + 1];

        for( int num : nums) {
            present[num] = true;
        }

        for (int i = 0; i <= n; i++) {
            if(!present[i]) {
                return i;
            }
        }
        return -1;
    }
}
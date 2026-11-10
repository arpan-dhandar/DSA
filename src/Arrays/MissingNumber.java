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
}
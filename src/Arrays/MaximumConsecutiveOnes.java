package Arrays;

public class MaximumConsecutiveOnes {
    static int maxOnes(int[] arr) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] == 1) {
                count ++;
            }
            else {
                count = 0;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}

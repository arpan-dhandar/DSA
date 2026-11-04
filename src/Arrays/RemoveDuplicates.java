
package Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] arr) {

        int i = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[i] != arr[j]) {

                i++;

                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4};

        int k = removeDuplicates(arr);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");

        for (int x = 0; x < k; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}

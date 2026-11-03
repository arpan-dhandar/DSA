package Arrays;
public class LargestNum {

    static int Num(int arr[]) {

        int number = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (number < arr[i]) {
                number = arr[i];
            }
        }

        return number;
    }

    public static void main(String[] args) {

        int[] arr = {21, 45, 89, 63, 44, 28};

        System.out.println("Largest Number = " + Num(arr));
    }
}

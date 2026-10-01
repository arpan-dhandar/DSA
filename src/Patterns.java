public class Patterns {

    // Pattern 7
    void Pattern7(int n) {

        for (int i = 0; i < n; i++) {

            // Space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }


    // Pattern 8
    void Pattern8(int n) {

        for (int i = 0; i < n; i++) {

            // Space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Star
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            // Space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }


    // Pattern 9
    void Pattern9(int n) {

        // Upper pyramid
        for (int i = 0; i < n; i++) {

            // Space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }


        // Lower inverted pyramid
        for (int i = 0; i < n; i++) {

            // Space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Star
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            // Space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }


    // Pattern 10
    void Pattern10(int n) {

        for (int i = 1; i <= 2 * n - 1; i++) {

            int star = i;

            if (i > n) {
                star = 2 * n - i;
            }

            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


    // Pattern 11
    void Pattern11(int n) {

        int start = 1;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }

            for (int j = 0; j <= i; j++) {

                System.out.print(start);

                start = 1 - start;
            }

            System.out.println();
        }
    }


    // Pattern 12
    void Pattern12(int n) {

        int space = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {

            // Left number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Right number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();

            space -= 2;
        }
    }

    // Pattern 13
    void Pattern13(int n) {
        int num =1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+ " ");
                num += 1;
            }
            System.out.println();
        }
    }

    // Pattern 14
    void Pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            for(char ch = 'A'; ch < 'A'+i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        Patterns obj = new Patterns();


         obj.Pattern14(5);
    }
}
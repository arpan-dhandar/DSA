public class Patterns {
    void Pattern7(int n){
     for(int i = 0; i < n; i++){
        //space
        for(int j=0; j<n-i-1; j++){
            System.out.print(" ");
        }
        //star
        for(int j=0; j< 2*i+1; j++ ){
            System.out.print("*");
        }
        //space
         for(int j=0; j<n-i-1; j++){
            System.out.print(" ");
        }
        System.out.println();
     }
    }

     void Pattern8(int n){
     for(int i = 0; i < n; i++){
        //space
        for(int j=0; j<i; j++){
            System.out.print(" ");
        }
        //star
        for(int j=0; j< 2*n-(2*i+1); j++ ){
            System.out.print("*");
        }
        //space
         for(int j=0; j<i; j++){
            System.out.print(" ");
        }
        System.out.println();
     }
    }
    
    void Pattern9(int n){
        for(int i = 0; i < n; i++){
        //space
        for(int j=0; j<n-i-1; j++){
            System.out.print(" ");
        }
        //star
        for(int j=0; j< 2*i+1; j++ ){
            System.out.print("*");
        }
        //space
         for(int j=0; j<n-i-1; j++){
            System.out.print(" ");
        }
        System.out.println();
     }
     for(int i = 0; i < n; i++){
        //space
        for(int j=0; j<i; j++){
            System.out.print(" ");
        }
        //star
        for(int j=0; j< 2*n-(2*i+1); j++ ){
            System.out.print("*");
        }
        //space
         for(int j=0; j<i; j++){
            System.out.print(" ");
        }
        System.out.println();
     }

    }

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

    void Pattern11(int n) {
        int start = 1;
        for (int i = 0; i< n; i++){
            if(i % 2 == 0) start = 1;
            else start = 0;
            for (int j = 0; j<=i ; j++){
                System.out.print( start);
                start = 1-start;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
       Patterns obj = new Patterns();
       obj.Pattern11(5);
    }
}

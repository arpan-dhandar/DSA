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

    public static void main(String[] args) {
       Patterns obj = new Patterns();
       obj.Pattern7(5);
    }
}

package Recursion;

public class FunctionalSum {
    public static int sum(int i){
        if(i==0) {
            return 0;
        }
      return  i + sum(i-1);
        }
        public static void main(String[] args) {
            System.out.println(sum(10));
        }
}

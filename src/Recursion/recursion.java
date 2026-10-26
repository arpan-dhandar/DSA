package Recursion;

public class recursion {
    public static void printNum(int i, int n){
        if(i>n) return;

        System.out.println(i);
        printNum(i+1, n);
    }

    public static void printNumRes(int i, int n){
        if(i<n) return;

        System.out.println(i);
        printNumRes(i-1, n);
    }
   
   public static void printNumBacktracking(int i, int n){
    if(i<1) return;

    printNumBacktracking(i -1,n);
    System.out.println(i);
   }
    public static void main(String[] args){
       
        printNum(1, 10);
        printNumRes(10, 1);
        printNumBacktracking(5,5);
    }
}

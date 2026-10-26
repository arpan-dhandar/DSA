package Recursion;

public class PrintNameRecursion {
    public static void printName(String name, int n){
        if (n <=0) return;

        System.out.println(name);

        printName(name, n-1);
    }

    public static void main (String[] args){
        String name = "Arpan";
        int n = 5;

        printName(name, n);
    }
}

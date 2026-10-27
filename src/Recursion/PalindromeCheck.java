package Recursion;

public class PalindromeCheck {
    public static boolean isPalindrome(String s, int i) {
        int n = s.length();
        if (i >= n / 2)
            return true;

        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false;
        }
        return isPalindrome(s, i + 1);
    }

    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "racecar";
        String s3 = "hello";

        System.out.println(s1 + " -> " + isPalindrome(s1, 0));
        System.out.println(s2 + " -> " + isPalindrome(s2, 0));
        System.out.println(s3 + " -> " + isPalindrome(s3, 0));
    }
}

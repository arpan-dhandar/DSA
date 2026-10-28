import java.util.Scanner;

public class AlphabetHash {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] hash = new int[26];

        // Count frequency of each alphabet
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                hash[ch - 'a']++;
            }
        }

        // Display frequency of all alphabets
        System.out.println("\nAlphabet Frequency Table:");

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);

            System.out.println(ch + " : " + hash[i]);
        }

        // Search character frequency
        System.out.print("\nEnter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.print("Enter character to search: ");
            char ch = Character.toLowerCase(sc.next().charAt(0));

            if (ch >= 'a' && ch <= 'z') {
                System.out.println(
                    "Frequency of " + ch + " = " + hash[ch - 'a']
                );
            } else {
                System.out.println("Invalid character!");
            }
        }

        sc.close();
    }
}

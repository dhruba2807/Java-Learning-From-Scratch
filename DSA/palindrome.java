
import java.util.*;

public class palindrome {
    public static boolean palindromeNum(int n) {
        int rev = 0;
        int temp = n;

        // Reverse the number
        while (n > 0) {
            int lastdigit = n % 10;
            rev = rev * 10 + lastdigit;
            n /= 10;
        }

        // Check palindrome condition
        return rev == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is Palindrome or Not: ");
        int n = sc.nextInt();

        if (palindromeNum(n)) {
            System.out.println(n + " is a Palindrome Number ");
        } else {
            System.out.println(n + " is NOT a Palindrome ");
        }

    
    }
}



// . Can you solve it using recursion?
// Yes:

// java
// Copy
// Edit
// public static boolean isPalindromeRecursive(String str, int left, int right) {
//     if (left >= right) return true;
//     if (str.charAt(left) != str.charAt(right)) return false;
//     return isPalindromeRecursive(str, left + 1, right - 1);
// }
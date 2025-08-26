import java.util.Scanner;

public class ButterflyPattern {

    // Function to print the Butterfly Pattern
    public static void pattern(int n) {

        // UPPER HALF of the butterfly
        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // LOWER HALF of the butterfly
        for (int i = n; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of The Pattern: ");
        int n = sc.nextInt();

        // Function call to print the butterfly pattern
        pattern(n);

        sc.close();
    }
}


/*  
=============================================================
💡 INTERVIEW PATTERN VARIATIONS (Frequently Asked)
=============================================================

1️⃣ HOLLOW BUTTERFLY PATTERN
----------------------------------
Input: n = 5

Output:
*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *

Code:
--------
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) System.out.print("*");
        else System.out.print(" ");
    }
    for (int j = 1; j <= 2*(n - i); j++) System.out.print(" ");
    for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) System.out.print("*");
        else System.out.print(" ");
    }
    System.out.println();
}
for (int i = n; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) System.out.print("*");
        else System.out.print(" ");
    }
    for (int j = 1; j <= 2*(n - i); j++) System.out.print(" ");
    for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) System.out.print("*");
        else System.out.print(" ");
    }
    System.out.println();
}


2️⃣ ALPHABET BUTTERFLY PATTERN
----------------------------------
Input: n = 4

Output:
A      A
AB    AB
ABC  ABC
ABCDABCD
ABC  ABC
AB    AB
A      A

Code:
--------
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print((char)(64+j));
    }
    for (int j = 1; j <= 2*(n - i); j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print((char)(64+j));
    }
    System.out.println();
}
for (int i = n; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print((char)(64+j));
    }
    for (int j = 1; j <= 2*(n - i); j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print((char)(64+j));
    }
    System.out.println();
}


3️⃣ NUMBER BUTTERFLY PATTERN
----------------------------------
Input: n = 4

Output:
1      1
12    12
123  123
12341234
123  123
12    12
1      1

Code:
--------
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    for (int j = 1; j <= 2*(n - i); j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    System.out.println();
}
for (int i = n; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    for (int j = 1; j <= 2*(n - i); j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    System.out.println();
}

=============================================================
These variations are often asked in **Java coding interviews**.
Keep practicing them for strong pattern-printing skills!
=============================================================
*/

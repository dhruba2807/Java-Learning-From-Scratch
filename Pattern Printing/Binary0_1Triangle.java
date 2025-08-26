import java.util.Scanner;

public class Binary0_1Triangle {

    // Method to print a 0-1 Binary Triangle pattern
    public static void pattern(int n) {

        // Outer loop → Handles the number of rows
        for (int i = 1; i <= n; i++) {

            // Inner loop → Prints numbers in each row
            for (int j = 1; j <= i; j++) {

                // Logic: If (i+j) is even → Print "1", else print "0"
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Taking input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Size of The Pyramid: ");
        int n = sc.nextInt();

        // Function call to print the pattern
        pattern(n);

        sc.close();
    }
}

/*
===============================
   INTERVIEW QUESTIONS & CODES
===============================

💡 Asked in TCS, CTS, Infosys, Wipro, Accenture, and Tech Mahindra

------------------------------------------------
Q1. Print the following Binary Triangle:
Input: 5
Output:
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
(Already solved above ✅)

------------------------------------------------
Q2. Print an Alphabet Triangle (Most Asked)
Input: 5
Output:
A
B B
C C C
D D D D
E E E E E

Approach:
- Use ASCII values (A = 65)
- Print characters row-wise

// Code:
for (int i = 0; i < n; i++) {
    for (int j = 0; j <= i; j++) {
        System.out.print((char)('A' + i) + " ");
    }
    System.out.println();
}

------------------------------------------------
Q3. Print Floyd's Triangle (Very Popular)
Input: 5
Output:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

// Code:
int num = 1;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(num++ + " ");
    }
    System.out.println();
}

------------------------------------------------
Q4. Print a Palindromic Number Triangle (Advanced)
Input: 5
Output:
    1
   121
  12321
 1234321
123454321

// Code:
for (int i = 1; i <= n; i++) {

    // Print spaces
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }

    // Print ascending numbers
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }

    // Print descending numbers
    for (int j = i - 1; j >= 1; j--) {
        System.out.print(j);
    }

    System.out.println();
}

------------------------------------------------
Q5. Print an Inverted 0-1 Binary Triangle
Input: 5
Output:
1 0 1 0 1
0 1 0 1
1 0 1
0 1
1

// Code:
for (int i = n; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }
    }
    System.out.println();
}

------------------------------------------------
💡 TIP for Interviews:
- Service-based companies often ask **pattern printing** questions.
- Focus on:
    ✅ Star patterns
    ✅ Number pyramids
    ✅ Binary triangles
    ✅ Alphabet patterns
    ✅ Palindromic structures

*/

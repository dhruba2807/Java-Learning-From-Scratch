
import java.util.*;

/*
    🔹 Interview Focused Notes (For TCS, CTS, Infosys, Wipro, Accenture)
    ---------------------------------------------------------------
    ✅ Frequently Asked Pattern Question:
        Q1) Print a hollow rectangle pattern using stars (*).

    🔹 Example:
        Input: row = 5, col = 5
        Output:
        *****
        *   *
        *   *
        *   *
        *****

    🔹 Variations Service-Based Companies May Ask:
        1. Hollow Rectangle  ✅ (This code covers it)
        2. Hollow Right-Angle Triangle
        3. Hollow Full Pyramid
        4. Diamond or Inverted Pyramid
        5. Pascal’s Triangle

    🔹 Key Skills Tested:
        - Logic building
        - Nested loops understanding
        - Handling edge cases
*/

public class HollowTriangle {

    // Method to print the hollow rectangle/star pattern
    public static void pattern(int row, int col) {

        // Outer loop → Controls the number of rows
        for (int i = 1; i <= row; i++) {

            // Inner loop → Controls the number of columns
            for (int j = 1; j <= col; j++) {

                // Border condition → Print '*' for first row, last row, first col, last col
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    // Otherwise print space
                    System.out.print(" ");
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Taking input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row Number: ");
        int row = sc.nextInt();

        System.out.print("Enter Col Number: ");
        int col = sc.nextInt();

        // Function call to print pattern
        pattern(row, col);

        sc.close();
    }
}

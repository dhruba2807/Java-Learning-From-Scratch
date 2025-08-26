import java.util.*;

/*
    🔹 Interview Focused Notes (For TCS, CTS, Infosys, Wipro, Accenture)
    -----------------------------------------------------------------
    ✅ Frequently Asked Pattern Question:
        Q1) Print an Inverted Rotated Right-Angle Pyramid.

    🔹 Example:
        Input: n = 5
        Output:
            *
           **
          ***
         ****
        *****
        
    🔹 Variations Service-Based Companies May Ask:
        1. Normal Right-Angle Triangle
        2. Inverted Right-Angle Triangle
        3. Rotated & Inverted Pyramid ✅ (This code)
        4. Full Pyramid
        5. Diamond Patterns

    🔹 Key Skills Tested:
        - Nested loops
        - Spacing logic
        - Star pattern printing
*/

public class InvertedRotatedPyramid {

    // Method to print the inverted rotated right-angle pyramid pattern
    public static void pattern(int n) {

        // Outer loop → Controls the number of rows
        for (int i = 1; i <= n; i++) {

            // Inner loop → Prints spaces before stars
            // As 'i' increases, spaces decrease → Right rotation achieved
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Inner loop → Prints stars
            // The number of stars in each row = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
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

import java.util.*;

/*
    🔹 Interview Focused Notes (For TCS, Wipro, Infosys, Cognizant)
    ---------------------------------------------------------------
    ✅ Question:
        Print an Inverted Half Pyramid with Numbers.
    
    🔹 Example:
        Input: n = 5
        Output:
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1

    🔹 Companies Ask Variations Like:
        1. Inverted Half Pyramid with Stars (*)
        2. Inverted Half Pyramid with Numbers ✅ (This Code)
        3. Right-Aligned Pyramid
        4. Full Pyramid

    🔹 Concepts Tested:
        - Nested Loops
        - Decreasing sequence
        - Number-based pattern
*/

public class InvertedHalfPyramid {

    // Method to print an inverted half-pyramid of numbers
    public static void pattern(int n) {

        // Outer loop → Controls the number of rows
        for (int i = 1; i <= n; i++) {

            // Inner loop → Prints numbers from 1 up to (n - i + 1)
            // Each row has fewer numbers as 'i' increases
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }

            // Move to the next line after printing one row
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input for size of the pyramid
        System.out.print("Enter The Number To Print the Pyramid: ");
        int n = sc.nextInt();

        // Function call to print the pattern
        pattern(n);

        sc.close();
    }
}

import java.util.Scanner;

public class averageArray {
    // Method to calculate average of non-negative integers
    static double findAverage(int[] arr) {

        int sum = 0;   // to store sum of non-negative numbers
        int count = 0; // to store how many non-negative numbers found
    
        // Loop through each number in the array
        for (int num : arr) {
            if (num >= 0) {  // Check if the number is non-negative (zero included)
                sum += num;  // Add it to sum
                count++;     // Increase count
            }
    }   
    
        // If no non-negative numbers found, return 0.0
        if (count == 0) return 0.0;
    
        // Calculate and return average (cast to double for decimal result)
        return (double) sum / count;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // array to store elements

        // Step 2: Read array elements from user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Call method to find average and display it
        double average = findAverage(arr);
        System.out.println("Average of non-negative integers: " + average);

        }
}

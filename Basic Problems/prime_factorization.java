import java.util.Scanner;

public class prime_factorization {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A Number To Primr Factorization:- ");
    int n = sc.nextInt();
      // Looping from 2 to n to find factors
    for(int i =2;i<=n;i++){
        
            // While i divides n completely
        while(n % i == 0){
              // Print the factor i (it's a prime factor)
            System.out.println("Prime Factor Are "+i+ " ");
                   // Divide n by i to reduce it
            n = n/i;

        }
        // Example:
        // Input: 100
        // Output: 2 2 5 5
        // Because 100 = 2 * 2 * 5 * 5
        }
    }
}

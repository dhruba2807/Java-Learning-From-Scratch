
import java.util.Scanner;

public class FloydsTriangle {
        public static void pattern(int n){
            int counter =1;
            for (int i = 1; i <=n; i++) {
                for(int j =1;j<=i;j++){
                    System.out.print(counter+" ");
                    counter++;

                }
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


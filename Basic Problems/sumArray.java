import java.util.Scanner;

public class sumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int sum =0;
        int [] arr =new int [n];
        System.out.println("Enter " + n + " elements:");
        for(int i =0;i<n;i++){

            arr[i] = sc.nextInt();
            //SUM OF ALL ARRAY ELEMENT  
            sum+=arr[i];

        }
        System.out.println("Sum of all array elements: " + sum);

        sc.close();


    }
}

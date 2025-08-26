import java.util.Scanner;

public class revers4Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
      //  int lastdigit;

        while (n>0) {
            //FIND LAST DIGIT
            int  lastdigit=n%10;
            System.out.println("Reverse The Number is:- "+lastdigit);
            
            //remove the number
            n=n/10;
        }
    }
}

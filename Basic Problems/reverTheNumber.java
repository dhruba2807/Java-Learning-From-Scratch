import java.util.Scanner;

public class reverTheNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter A Number To Reverse:- ");
        int n = sc.nextInt();
        int rev =0;
        while(n>0){
            // FIND LAST DIGIT
                int lastdigit = n%10;


                // REVERSE THE GIVEN NUMBER FORMULA
                rev = (rev *10) + lastdigit;


                //REMOVE THE NUMBER
                
                n =n/10;
        }
                System.out.println("Finally The Number Reverse:- "+rev);
    }   
}

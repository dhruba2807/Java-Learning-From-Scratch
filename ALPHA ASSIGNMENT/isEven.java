import java.util.*;

public class isEven {
    public static boolean iseven(int n){

        return (n%2 == 0) ?  true:  false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number To Check The NUmber is Even Or Odd:- ");
        int n =sc.nextInt();
        System.out.print("IS The Number is Even:- "+iseven(n));
    }
}

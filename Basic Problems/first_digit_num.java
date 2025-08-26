import java.util.Scanner;

public class first_digit_num {
    public static int firstdigit(int n ){

        while(n>=10){
            n = n/10;
        }
        return n;

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Find The first Digit Of A Number:- ");
        int n = sc.nextInt();
        System.out.println(firstdigit(n));

    }
}

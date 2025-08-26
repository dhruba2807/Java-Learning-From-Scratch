import java.util.Scanner;

public class decToBnary {

    public static void Boolean(int n){
        int pow = 0;
        int binnum = 0;
        while(n>0){
            int remainder = n %2;
            binnum = binnum + (remainder *(int) Math.pow(10,pow));
            pow++;
            n =n/2;

        }
        System.out.print("The Decimal Number is "+n+" Is Converted Into Binary Form "+binnum );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number To Convert The Dec To Binary:- ");
        int n = sc.nextInt();
        Boolean(n);

    }
}

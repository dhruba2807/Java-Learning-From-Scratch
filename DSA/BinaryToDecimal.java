import java.util.*;

public class BinaryToDecimal {
    
        public static void bintodec(int binNum){
            int myNum= binNum;
                int pow =0;
                int decNUm = 0;
                while(binNum>0){
                    int lastdigit = binNum %10;
                    decNUm =decNUm +(lastdigit*(int)Math.pow(2,pow));
                    pow++;
                    binNum =binNum/10;

                }
                System.out.println("Decimal Of "+ myNum + " is = "+ decNUm);
        
            }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter A Binary Number:- ");
                int n = sc.nextInt();
                bintodec(n);

            }


}

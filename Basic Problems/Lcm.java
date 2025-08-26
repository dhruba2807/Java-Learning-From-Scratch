import java.util.*;

public class Lcm {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The First Number");
            int n1 = sc.nextInt();
            System.out.println("Enter The Second  Number");
            int n2 =sc.nextInt();
        int new1=n1;
        int new2=n2;


            // int lcm = (n1>n2) ? n1:n2;
            // while (true) {
            //         if(lcm%n1 == 0 && lcm%n2 ==0){
            //             System.out.println("The Lcm Is: "+lcm);
            //             break;
            //         }
            //         ++lcm;
            // }
            int gcd =1;
            for(int i =1;i<=n1 && i<=n2;i++){
                if(n1%i ==0 && n2 %i ==0){
                    gcd = i;
                }
            }
            int lcm = (new1*new2)/gcd;
            System.out.println("Lcm is "+lcm);
        }
}

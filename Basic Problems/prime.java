import java.util.*;
public class prime {
    public static boolean isprime(int n){
        if(n<=1) return false;
        for(int i =2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;

    }
    public static int nextprime(int n){
        int next = n+1;
        while(true){
            if(isprime(next)){
                return next;
            }
            next++;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int n = sc.nextInt();
        boolean ans = isprime(n);
        System.out.println(ans);
    }

}

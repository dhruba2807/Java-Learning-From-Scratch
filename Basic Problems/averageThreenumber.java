import java.util.*;

public class averageThreenumber {
    public static int average (int a,int b,int c){
            return (a+b+c)/3;

        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First NUmber:- ");
        int a = sc.nextInt();
        System.out.println("Enter The Second NUmber:- ");    
        int b = sc.nextInt();        
        System.out.println("Enter The Third NUmber:- "); 
        int c = sc.nextInt();    
        int averagethenumber = average(a,b,c);
        System.out.println("Average Of the"+a +b +c+"Number is:- "+averagethenumber );

    }

}

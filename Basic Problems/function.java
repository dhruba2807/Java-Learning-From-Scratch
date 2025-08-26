import java.util.Scanner;
import java.util.function.Function;

class function{
    // FUNCTION WITH 
    public static  void hello(){
        System.out.println("Hello World");
    }
    //Function with parameters and return value
    public static int add(int a,int b){
        return a+b;
    }
    //Function that doubles a number (like your assignment)
    public static int returnValueFunction(int n){
        return n*2;

    }
   // Function that Returns a Value
        public static int add1(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static  void main(String[] args){

        hello();
        int n = add(7,8);
        System.out.println(n);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:- ");
        int num = sc.nextInt();
        int result = returnValueFunction(num);
        System.out.println(result);


        int result1 = add(5, 3);
        System.out.println("Sum is: " + result1);


    }
}
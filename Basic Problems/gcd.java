import java.util.Scanner;

class gcd{
    public static void main(String[] args){
                                      //FIRST APPROACHES
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter The First Number");
        // int n1 = sc.nextInt();
        // System.out.println("Enter The Second Number");
        // int n2 = sc.nextInt();
        // int gcd = 1;
        // for(int i =1; i<n1 && i<n2;i++){
        //     if(n1%i ==0 && n2%i ==0){
        //         gcd = i;
        //     }
        // }
        // System.out.println("Gcd: "+gcd);

        
                                    //SECOND APPROACHES
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
        int n1 = sc.nextInt();
        System.out.println("Enter The Second Number");
        int n2 = sc.nextInt();
        while(n1!=n2) {
                if(n1>n2){
                    n1=n1-n2;
                }
                if(n2>n1){
                    n2=n2-n1;
                }
        }
        System.out.println("Gcd "+n1);
    }
}
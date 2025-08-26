import java.util.Scanner;

public class fibonacci  {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter The Number For Fibonacci Series: ");
            int n = sc.nextInt();
            int firstnum= 0, secondnum=1;
            for(int i =0;i<=n;i++){
                System.out.print(firstnum+ " ");
                
                int next_num = firstnum+secondnum;
                firstnum = secondnum;
                secondnum = next_num;

            }
        

    }
}

import java.util.Scanner;

class sortedArrayOrnot{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of The Array:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Array Elemment");
        for(int i=0;i<n;i++){
            
            arr[i] = sc.nextInt();
            
        }
        boolean ans = isSorted(arr,n);
        if(ans == true){
            System.out.println("Yes! It is A Sorted Array");
        }
        else{
            System.out.println("No! It is A Not Sorted Array");
        }    
    }
    public static boolean isSorted(int[] arr,int n){
        for(int i =1;i<n;i++){
            if(arr[i]<arr[i-1]){
                    return false;
    
            }
        }
        return true;
    }
    
}
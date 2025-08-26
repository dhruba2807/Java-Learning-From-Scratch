
import  java.util.*;

public class twoSum{
                           //     TIME COMPLEXITY :- O(N LOG N)
    // public static boolean twosum(int [] arr,int target){

    //     Arrays.sort(arr);
    //     int left =0;
    //     int right = arr.length-1;

    //     while(left <right){

    //         int sum = arr[left] +arr[right];

    //         if(sum == target){
    //             return true;

    //         }
    //         else if(sum<target){
    //             left++;
    //         }
    //         else{
    //             right--;
                
    //         }

    //     }
    //     return false;
    
    
    // }
    

                                                                  //TIME COMPLEXITY :- O(N)
    public static boolean twosum(int[] arr, int target) {
    
            HashSet<Integer> set = new HashSet<>();
            for(int num: arr){
                int complement = target - num;
                if(set.contains(complement)){
                    return true;
    
                }
                set.add(num);
    
            }
            return false;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // call function and print result
        boolean result = twosum(arr, target);
        System.out.println("Two sum exists? " + result);

        sc.close();


    }
}



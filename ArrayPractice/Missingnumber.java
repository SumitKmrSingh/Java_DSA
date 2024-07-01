/* Missing number
 * 
 * Example 1:

        Input:                                                       
        N = 4                                        
        A[] = {1, 4, 3}
        Output:
        2     
        Explanation:
        Vaibhav placed 4 integers but he picked
        up only 3 numbers. So missing number
        will be 2 as it will become 1,2,3,4.

    Example 2:

        Input:                        
        N = 5
        A[] = {2, 5, 3, 1}
        Output:
        4
        Explanation:
        Vaibhav placed 5 integers on the board,
        but picked up only 4 integers, so the
        missing number will be 4 so that it
        will become 1,2,3,4,5.

        Exected Time Complexity: O(N)
        Expected Auxiliary Space: O(1)
 * 
 */

package ArrayPractice;

import java.util.Scanner;
public class Missingnumber {
    public static int missingValue(int []arr, int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum = sum + i;
        }
        int arraySum=0;
        for(int i=0; i<n-1; i++){
            arraySum = arraySum + arr[i];
        }
        return sum-arraySum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=4;
        int []arr = {1,4,3};
        System.out.print("Array Elements : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        int res = missingValue(arr,n);
        System.out.println("Missing number : "+res);
    }
}

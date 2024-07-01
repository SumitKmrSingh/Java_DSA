/* Segregate Even and Odd numbers
 * Note :- You don't have to return the array, you just have to modify it in-place.
 * 
 * Example 1:

        Input: 
        N = 7
        Arr[] = {12, 34, 45, 9, 8, 90, 3}
        Output: 8 12 34 90 3 9 45
        Explanation: Even numbers are 12, 34,
        8 and 90. Rest are odd numbers. After
        sorting even numbers 8 12 34 90 and 
        after sorting odd numbers 3 9 45. Then
        concat both.

  Example 2:

        Input: 
        N = 5
        Arr[] = {0, 1, 2, 3, 4}
        Output: 0 2 4 1 3
        Explanation: 0 2 4 are even and 1 3
        are odd numbers.

        Expected Time Complexity: O(N log(N))
        Expected Auxiliary Space: O(N)
 * 
 */


package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class segregateEvenOddAcs {
    public static int[] segregateEvenOdd(int []arr){
        Arrays.sort(arr);
        int k=0;
        int []segreateArray = new int[arr.length];

        // segreate even
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                segreateArray[k] = arr[i];
                k++;
            }
        }

        // segreate odd
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                segreateArray[k] = arr[i];
                k++;
            }
        }
        return segreateArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter all the "+size+" elements of array : ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();

        System.out.print("Array Before Segregate : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        int []segreatArray = segregateEvenOdd(arr);
        System.out.print("Array after Segreated : ");
        for(int i=0; i<segreatArray.length; i++){
            System.out.print(segreatArray[i]+" ");
        }
        
    }
}

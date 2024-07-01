/* Given an array arr[] of n positive integers. Push all the zeros of the given array
   to the right end of the array while maintaining the order of non-zero elements. 
   Do the mentioned change in the array in-place. 

   Example 1:                                      

    Input:
    N = 5
    Arr[] = {3, 5, 0, 0, 4}
    Output: 3 5 4 0 0
    Explanation: The non-zero elements
    preserve their order while the 0
    elements are moved to the right.

    Example 2:

    Input:
    N = 4
    Arr[] = {0, 0, 0, 4}
    Output: 4 0 0 0
    Explanation: 4 is the only non-zero
    element and it gets moved to the left.
   
*/

package ArrayPractice;

import java.util.Scanner;
import java.util.Scanner;
public class MoveAllZeroToTheEndofArray {

    public static void pushAllZeroToEnd(int []arr){
        int k=0;
        int count=0;
        
        //count all zero In given array
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count++;
            }
        }

        //Store non-zero value In array
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[k] = arr[i];
                k++;
            }
        }

        // Store all zero Value in a given array
        for(int i=0; i<count; i++){
            arr[k] = 0;
            k++;
        }
        return; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter all the "+size+" elements of array : ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array elements Before moveing all zero to end : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        
         pushAllZeroToEnd(arr);
        System.out.print("Array elements after moving all zeros to end : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}

/* Rearrange array in increasing-decreasing order
Problem Statement: Rearrange the array such that the first half is arranged in 
increasing order, and the second half is arranged in decreasing order 

Examples:

Example 1:
Input: 8 7 1 6 5 9
Output: 1 5 6 9 8 7
Explanation: First three elements are in the ascending order and next three elements are in the descending order.

Example 2:
Input: 4 2 8 6 15 5 9 20
Output: 2 4 5 6 20 15 9 8

*/

package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArray {
    public static void rearrangeArray(int []arr){
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0; i<n/2; i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=n-1; i>=n/2; i--){
            System.out.print(arr[i]+" ");
        }
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

        System.out.print("Array elements are  : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        rearrangeArray(arr);
    }
}

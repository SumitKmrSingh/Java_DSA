/* Sample Problem: Maximum in all subarrays of size K in Java
*
* Examples :
Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3
Output: 3 3 4 5 5 5 6
Explanation:
Maximum of 1, 2, 3 is 3
Maximum of 2, 3, 1 is 3
Maximum of 3, 1, 4 is 4
Maximum of 1, 4, 5 is 5
Maximum of 4, 5, 2 is 5
Maximum of 5, 2, 3 is 5
Maximum of 2, 3, 6 is 6

Input: arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}, K = 4
Output: 10 10 10 15 15 90 90
Explanation:
Maximum of first 4 elements is 10, similarly for next 4
elements (i.e from index 1 to 4) is 10, So the sequence
generated is 10 10 10 15 15 90 90




Method 1: This is the simple method to solve the above problem.


Approach: The idea is very basic run a nested loop, the outer loop which will mark the starting point of the
* subarray of length k, the inner loop will run from the starting index to index+k, k elements from starting index and print
* the maximum element among these k elements.


Algorithm:
    Create a nested loop, the outer loop from starting index to n - k th elements. The inner loop will run for k iterations.
    Create a variable to store the maximum of k elements traversed by the inner loop.
    Find the maximum of k elements traversed by the inner loop.
    Print the maximum element in every iteration of outer loop */



package CollectionFramwork.Queue;

import java.util.Scanner;

public class MaxInAllSubarrayOfSizeK {
    public static void printMax(int []arr, int k){
        int max=0;
        for(int i=0; i<=arr.length-k; i++){
            max=arr[i];
            for(int j=1; j<k; j++){
                if(arr[j+i] > max){
                    max = arr[j+i];
                }
            }
            System.out.print(max+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter all the "+size+" elements of array : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the max size of Subarray : ");
        int k=sc.nextInt();
        System.out.print("All the elements of array are : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.print("The maximum for each and every contiguous subarray of size "+k+" : ");
        printMax(arr,k);    // k -> size of Subarray
    }
}

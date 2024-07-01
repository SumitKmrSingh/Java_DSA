/* Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * 
 * Example 1:

    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

    Input: nums = [-1,-100,3,99], k = 2
    Output: [3,99,-1,-100]
    Explanation: 
    rotate 1 steps to the right: [99,-1,-100,3]
    rotate 2 steps to the right: [3,99,-1,-100]
 */


package ArrayPractice;

import java.util.Scanner;
public class RotateArray {
    public static int[] rotate(int []arr, int k){
        getReverseArray(arr, 0, arr.length-1);
        getReverseArray(arr, 0, (k-1));
        getReverseArray(arr, k, arr.length-1);
        return arr;
    }

    public static int[] getReverseArray(int []arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        int size=sc.nextInt();
        int []arr = new int[size];

        System.out.print("Enter all the "+size+" elements of array : ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the value how Steps to rotate the array : ");
        int k=sc.nextInt();

        // printing all elements of array before k steps rotations
        System.out.print("Array Before "+k+" Steps rotation : ");
        try{
            for(int x : arr){
                System.out.print(x+" ");
            }         
        }
        catch(ArrayIndexOutOfBoundsException ar){
            System.out.println(ar);                           ;
        }
        System.out.println();

        int []kStepRot = rotate(arr,k);  // Calling rotate() method

        // Printing all the elements of array after k steps rotations
        System.out.print("Array after "+k+" Steps Rotations : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}

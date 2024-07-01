/* Find Median of the given Array
Problem Statement: Given an unsorted array, find the median of the given array.

Example 1:
Input: [2,4,1,3,5]
Output: 3

Example 2:
Input: [2,5,1,7]
Output: 3.5
*/

package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class MedianArray {
    public static double getMedianOfArray(int []arr){
        Arrays.sort(arr);
        if(arr.length%2 == 0){
            int medi1 = arr.length/2-1;
            int medi2 = arr.length/2;
            double res = (double)(arr[medi1] + arr[medi2])/2;
            return res;
        }
        else {
            int medi=arr.length/2;
            double res = (double)arr[medi];
            return res;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter all "+size+" Elements of arrray : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("All the "+size+" Elements of array : ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        System.out.println();
        double result = getMedianOfArray(arr);
        System.out.println("Medain of array Is : "+result);
    }
}

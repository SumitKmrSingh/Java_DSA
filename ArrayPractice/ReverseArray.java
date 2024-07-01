/* Reverse the Given array */

package ArrayPractice;

import java.util.Scanner;
public class ReverseArray {
    public static int[] getReverseArray(int []arr, int start, int end){
        // Method 1
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp; 
            start++;
            end--;
        }

        // Method 2
        // for(int i=0; i<arr.length/2; i++){
        //     int temp = arr[i];
        //     arr[i] = arr[end-i];
        //     arr[end-i] = temp;
        // }
        return arr;
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

        System.out.print("Array Before Reverse : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        //calling getReverseArray() method
        int []revArray = getReverseArray(arr,0,arr.length-1);
        System.out.print("Array after Reverse : ");
        for(int x : revArray){
            System.out.print(x+" ");
        }
    }
}

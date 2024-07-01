/* Remove Duplicates From an Unsorted Array
Problem Statement: Given an unsorted array, remove duplicates from the array.

Example 1:
Input: arr[]={2,3,1,9,3,1,3,9}
Output:  {2,3,1,9}

Explanation: Removed all the duplicate elements

Example 2:
Input: arr[]={4,3,9,2,4,1,10,89,34}
Output: {3,4,9,2,1,10,34,89}
Explanation: Removed all the duplicate elements

*/


package ArrayPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDublicateUnSorted {
    public static void removeDublicate(int []arr){

        // Method 1 (Using HashMap)
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                System.out.print(arr[i]+" ");
                map.put(arr[i], 1);
            }
        }

        // Method 2 (Using HashSet)
        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0; i<arr.length; i++){
        //     if(!set.contains(arr[i])){
        //         System.out.print(arr[i]+" ");
        //         set.add(arr[i]);
        //     }
        // }
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
        System.out.print("Array Elements Before removing Dublicate : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.print("Array Element after removing Dublicates : ");
        removeDublicate(arr);
    }
}

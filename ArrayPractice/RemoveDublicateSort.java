/* Remove Duplicates in-place from Sorted Array
Problem Statement: Given an integer array sorted in non-decreasing order, remove the 
duplicates in place such that each unique element appears only once. The relative 
order of the elements should be kept the same. 

*/


package ArrayPractice;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDublicateSort {
    public static int removeDublicate(int []arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        int k=set.size();
        int j=0;
        for(int x : set){
            arr[j] = x;
            j++;
        }
        return k;
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
        int k=removeDublicate(arr);
        for(int i=0; i<k; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

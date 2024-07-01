/* Write a C# Sharp program to find two numbers in an array of integers whose product is equal to a given number.
Sample Data:
({10, 18, 39, 75, 100}, 180) -> {10, 18}
({10, 18, 39, 75, 100}, 200) -> {}
({10, 18, 39, 75, 100}, 702) -> {18, 39} */

package ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ProductOfTwoElements {
    public static ArrayList getTwoElements(int []arr, int k){
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        int start=0;
        int end=arr.length-1;

        while(start < end){
            int product = arr[start]*arr[end];
            if(product == k){
                list.add(arr[start]);
                list.add(arr[end]);
                return list;
            }
        }
        return list;
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
        System.out.print("Enter the target number : ");
        int target = sc.nextInt();
        System.out.print("Array Elements are : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        ArrayList<Integer> lsit = getTwoElements(arr, target);
    }
}

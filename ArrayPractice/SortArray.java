package ArrayPractice;

import java.util.Scanner;
public class SortArray {
    public static int[] getSortedArray(int []arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter all the "+size+" elements of array : ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array elements Before Sorting : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        int []sort = getSortedArray(arr);
        System.out.print("Array Element after Sorting : ");
        for(int x : sort){
            System.out.print(x+" ");
        }
    }
}

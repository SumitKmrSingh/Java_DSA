package Sorting;

import java.util.Scanner;

public class MergeSort2 {
    public static void conaquer(int []arr, int si, int mid, int ei){
        int []merge = new int[ei-si+1];
        int index1=si;
        int index2=mid+1;
        int mainArrayIndex=0;
        while(index1 <= mid && index2 <= ei){
            if(arr[index1] < arr[index2]){
                merge[mainArrayIndex] = arr[index1];
                mainArrayIndex++;
                index1++;
            }
            else {
                merge[mainArrayIndex] = arr[index2];
                mainArrayIndex++;
                index2++;
            }
        }
        while(index1 <= mid){
            merge[mainArrayIndex] = arr[index1];
            mainArrayIndex++;
            index1++;
        }

        while (index2 <= ei) {
            merge[mainArrayIndex] = arr[index2];
            mainArrayIndex++;
            index2++;
        }
        for(int i=0,j=si; i<merge.length; i++,j++){
            arr[j] = merge[i];
        }
    }
    public static void divide(int []arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conaquer(arr,si,mid,ei);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter all the "+size+" elements of array : ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array elements Before Sorted : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        int s=0;
        int e=arr.length-1;
        divide(arr,s,e);
        System.out.println();
        System.out.print("Array elements after Sorted : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}

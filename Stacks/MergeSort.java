package Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void merge(int []arr, int s, int e){
        int mid=s+(e-s)/2;

        int len1=mid-s+1;
        int len2=e-mid;

        int []firstPart = new int[len1];
        int []secondPart = new int[len2];

        // copy value
        int mainIndex=0;
        for(int i=0; i<len1; i++){
            firstPart[i]=arr[mainIndex];
            mainIndex++;
        }
        mainIndex=mid+1;
        for(int i=0; i<len2; i++){
            secondPart[i] = arr[mainIndex];
            mainIndex++;
        }

        // merge two sorted array
        int index1=0;
        int index2=0;
        int mainArrayIndex=s;

        while (index1 < len1 && index2 < len2) {
            if(firstPart[index1] < secondPart[index2]){
                arr[mainArrayIndex] = firstPart[index1];
                mainArrayIndex++;
                index1++;
            }
            else {
                arr[mainArrayIndex] = secondPart[index2];
                mainArrayIndex++;
                index2++;
            }
        }

        while (index1 < len1) {
            arr[mainArrayIndex] = firstPart[index1];
            mainArrayIndex++;
            index1++;
        }

        while (index2 < len2) {
            arr[mainArrayIndex] = secondPart[index2];
            mainArrayIndex++;
            index2++;
        }
    }

    public static void mergeSort(int []arr, int s , int e){
        // base case
        if(s>=e){
            return;
        }

        int mid=s+(e-s)/2;

        // left part ko sort karana hai
        mergeSort(arr, s, mid);

        // right part ko sort karana hai
        mergeSort(arr, mid+1, e);

        // merge
        merge(arr,s,e);
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
        mergeSort(arr,s,e);
        System.out.println();
        System.out.print("Array elements after Sorted : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}

/* Bubble Sort
 * Best Case -> When array Is sorted -> TC : o(n)
 * Worst Case -> When array Is reverse unsorted like descending order -> TC : o(n^2)
 * space : o(1)
 */

package Sorting;

import java.util.Scanner;

public class BubbleSortOptmize {
    public static int[] getBubbleSort(int []arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
            if(count==0){
                break;
            }
        }
       return arr;
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
        arr = getBubbleSort(arr);
        arr = getBubbleSort(arr);
        System.out.println();
        System.out.print("Array elements after Sorted : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}

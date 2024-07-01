/* Inseration Sort
 * Best Case -> When array Is sorted -> TC : o(n)
 * Worst Case -> When array Is reverse unsorted like descending order -> TC : o(n^2)
 * space : o(1)
 */

package Sorting;

import java.util.Scanner;

public class InserationSort {
    public static int [] getInserationSort(int []arr){
        for(int i=1; i<arr.length; i++){
            int temp=arr[i];
            int j=i-1;
            for(; j>=0; j--){
                if(arr[j] > temp){
                    arr[j+1]=arr[j];
                }
                else {
                    break;
                }
            }
            arr[j+1]=temp;
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
        arr = getInserationSort(arr);
        System.out.println();
        System.out.print("Array elements after Sorted : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}


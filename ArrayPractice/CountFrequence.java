/* Count frequency of each element in the array
Problem statement: Given an array, we have found the number of occurrences of each
 element in the array.

  Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 
    10  3
	 5  2
    15  1
Explanation: 10 occurs 3 times in the array
	         5 occurs 2 times in the array
             15 occurs 1 time in the array

Example2: 
Input: arr[] = {2,2,3,4,4,2};
Output: 
    2  3
	3  1
    4  2
Explanation: 2 occurs 3 times in the array
	         3 occurs 1 time in the array
             4 occurs 2 time in the array

 */



package ArrayPractice;

import java.util.Scanner;
public class CountFrequence {
    public static void countFreq(int []arr){
        boolean []visited = new boolean[arr.length];
        for(int i=0; i<arr.length; i++){
            if(visited[i] == true){
                continue;
            }
            int count=1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i]+" -> "+count);
        }
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

        System.out.print("Array elements are  : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        countFreq(arr);

    }
}

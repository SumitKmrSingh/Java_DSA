/* Given an array Arr of size N, print second largest distinct element from an array. 
 *  
 * Example 1:

        Input: 
        N = 6
        Arr[] = {12, 35, 1, 10, 34, 1}
        Output: 34
        Explanation: The largest element of the 
        array is 35 and the second largest element
        is 34.

    Example 2:

        Input: 
        N = 3
        Arr[] = {10, 5, 10}
        Output: 5
        Explanation: The largest element of 
        the array is 10 and the second 
        largest element is 5.

        Expected Time Complexity: O(N)
        Expected Auxiliary Space: O(1)
*/

package ArrayPractice;

import java.util.Scanner;
public class SecondLargest {

    public static int getSecondLargest(int []arr){
        int largest=0;
        int secondLargest=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest){
                if(secondLargest == -1 || arr[i] > secondLargest){
                    secondLargest = arr[i];
                }
            }
        }
        return secondLargest;
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
        System.out.print("All "+size+" elements of array : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        int secondLargest = getSecondLargest(arr);
        System.out.println("Second Largest Value : "+secondLargest);
    }
}

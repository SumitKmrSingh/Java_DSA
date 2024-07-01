/* Find Second Smallest and Second Largest Element in an array */

package ArrayPractice;

import java.util.Scanner;

public class SecondLargestAndSmallest {
    public static int[] getSecondLargestAndSmallest(int []arr){
        int []result = new int[2];
        if(arr.length < 2){
            result[0] = -1;
            result[1] = -1;
        }
        int small = Integer.MAX_VALUE;
        int Second_Small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int Second_Large = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(small > arr[i]){
                small = arr[i];
            }
            if(large < arr[i]){
                large = arr[i];
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] < Second_Small && arr[i] != small){
                Second_Small = arr[i];
            }
            if(arr[i] > Second_Large && arr[i] != large){
                Second_Large = arr[i];
            }
        }

        result[0] = Second_Small;
        result[1] = Second_Large;

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter all the elements of array are : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("All the elements of array are : ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        System.out.println();
        int []res = getSecondLargestAndSmallest(arr);
        System.out.println("Second Smallest number : "+res[0]);
        System.out.println("Second Largest number : "+res[1]);
    }
}

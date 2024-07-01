// Reverse array Using Stack


package CollectionFramwork.Stack;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayUsingStack {

    // Method of reverse array
    public static int[] reverseArray(int []arr){
        // Stack<Integer> stack = new Stack<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // pushing all the elements of array In Stack
        for(int x : arr){
            stack.push(x);
        }

        // pop all the elements of stack Into an a given array
        for(int i=0; i<arr.length; i++){
            arr[i] = stack.pop();
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int []arr = new int[size];

        System.out.print("Enter all the Elements of array are : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array Before Reverse : ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        int []revArray = reverseArray(arr);
        System.out.println();
        System.out.print("Array after Reverse : ");
        for(int x : revArray){
            System.out.print(x+" ");
        }
    }
}

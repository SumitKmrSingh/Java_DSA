package SteamInJava;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumValueInArray {
    public static int filterUsingStream(int []arr){
        int min = Arrays.stream(arr)
                        .min()
                        .getAsInt();
        
       return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter all the elements of array : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("All the Elements of an array are : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        int max = filterUsingStream(arr);
        System.out.println("Maximum Value In a Given array Is : "+max);
        

        // GFG Stream Quize
        // int []arr = {1, 2, 3, 4};
        // System.out.println((float)Arrays.stream(arr).filter(e -> e%2 == 0).count());
    }
}

package SteamInJava;

import java.util.Arrays;
import java.util.Scanner;

public class EvenSum {
    public static int getEvenSum(int []arr){
        int getEvenSum = Arrays.stream(arr)
                               .filter(e -> e%2 == 0)
                               .sum();
        
        return getEvenSum;

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
        int getEvenSum = getEvenSum(arr);
        System.out.println("Sum of even Value : "+getEvenSum);
        
    }
}

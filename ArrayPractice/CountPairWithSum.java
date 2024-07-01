package ArrayPractice;

import java.util.Scanner;

public class CountPairWithSum {
    public static int countPairWithGivenSum(int []arr, int k){
        int count=0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                int sum=arr[i]+arr[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter all the elements of array : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Given Sum Value : ");
        int target=sc.nextInt();
        System.out.print("All the elements of array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        int result = countPairWithGivenSum(arr, target);
        System.out.println("Total number of Pair of target Sum : "+result);
    }
}

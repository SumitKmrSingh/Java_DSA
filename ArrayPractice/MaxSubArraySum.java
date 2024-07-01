/* Maxium Sub array Sum */

package ArrayPractice;

import java.util.Scanner;

public class MaxSubArraySum {

    // Time -> o(n^3)
    public static int getSubArraySum(int []arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<j; k++){
                    sum=sum+arr[k];
                }
            }
            if(sum > maxSum){
                maxSum=sum;
            }
        }
        return maxSum;
    }

    // Time -> o(n^2)
    public static int getSubArraySum1(int []arr){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum = sum + arr[j];
            }
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter all "+size+" Elements of arrray : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("All the "+size+" Elements of array : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        int res = getSubArraySum(arr);
        System.out.println();
        System.out.println("Maxium Sub array Sum with o(n^3) : "+res);
        System.out.println("Maxium Sub array Sum with o(n^2) : "+ getSubArraySum1(arr));
    }
}

package ArrayPractice;

import java.util.Scanner;

public class TrappingRainWater {
    public static int trappingWater(int []arr){
        int []left = new int[arr.length];
        int []right =new int[arr.length];

        // left
        left[0]=arr[0];
        for(int i=1; i<arr.length; i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }

        // right
        right[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }

        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum = sum + (Math.min(left[i], right[i]) - arr[i]);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter all the "+size+" Elements of array : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("All the elements of array are : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int res = trappingWater(arr);
        System.out.println("Total Trapped Water : "+res);
    }
}

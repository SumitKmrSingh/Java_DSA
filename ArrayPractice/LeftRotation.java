package ArrayPractice;

import java.util.Scanner;

public class LeftRotation {
    public static void getKTimesRotation(int []arr){
        int temp=arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
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
        System.out.print("Enter the number times of rotation : ");
        int rot=sc.nextInt();

        // array elements Before K times rotations
        System.out.print("Array Elements Before "+rot+" times Rotation : ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        // calling getKTimesRotation() method to rotate array K times In Left direction
        System.out.println();
        for(int i=1; i<=rot; i++){
            getKTimesRotation(arr);
        }

        // array elements after K times Left rotations
        System.out.print("Array Elements after "+rot+" times Rotation : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        
    }
}

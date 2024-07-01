package ArrayPractice;

import java.util.Scanner;
public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter all the elements of array : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Index no which we want to delete : ");
        int target = sc.nextInt();
        System.out.print("Array elements Before Removing : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        int []res = new int[size-1];
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(i==target){
                continue;
            }
            res[j] = arr[i];
            j++;
        }
        System.out.println();
        System.out.print("Array elements after Removing : ");
        for(int x : res){
            System.out.print(x+" ");
        }

    }
}

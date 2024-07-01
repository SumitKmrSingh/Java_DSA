package ArrayPractice;

import java.util.Scanner;
public class GroupElement {
    public static  void making3ElementGruop(int []arr){
        for(int i=0; i<arr.length; i=i+3){
            int temp = arr[i+2];
            arr[i+2] = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Array after Swaping In Group : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter all the "+size+" Elements of array are : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("All the "+size+" elements of array are : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        making3ElementGruop(arr);
    }
}

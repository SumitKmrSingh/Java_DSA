package ArrayPractice;

import java.util.Scanner;
import java.util.Arrays;
class SecondLargestElement{
    public int getSecondLargestElement(int []arr){
         Arrays.sort(arr);
         
        //  int []uniqueArr = new int[arr.length];
        //  int idx=0;
        //  for(int i=0; i<arr.length-1; i++){
        //         if(arr[i] != arr[i+1]){
        //             uniqueArr[idx]=arr[i];
        //             idx++;
        //         }
        //     }
         return arr.length-2;
    }
}

public class SecondLargestValue_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        int size=sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter all the "+size+" elements of array : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("All the elements of array are : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //Creating the object of SecondLargestElement class
        SecondLargestElement ref = new SecondLargestElement();
        int secondLargest = ref.getSecondLargestElement(arr);
        System.out.println("Second Largest Element In a array : "+arr[secondLargest]);
    }
}

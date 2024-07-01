package ArrayPractice;

import java.util.HashMap;
import java.util.Scanner;

public class MapCountFreq {
    public static void countFreq(int []arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
        for(int x : map.keySet()){
            System.out.println(x+" -> "+map.get(x));
        }
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

        System.out.print("Array elements are  : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        countFreq(arr);
    }
}

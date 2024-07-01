package CollectionsFramework;

import java.util.Arrays;

public class LeanArrayClass {
    public static void main(String[] args) {
        int []numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(numbers, 4);
        
        System.out.println("The Index of element 4 In the array at Index : "+index);

        Integer []num = {1, 2, 44, 31, 76, 91, 88, 99};
        Arrays.sort(num);

        Arrays.fill(num, 14);

        for(int i : num){
            System.out.println(i);
        }
    }
}

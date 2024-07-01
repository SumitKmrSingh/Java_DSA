package SteamInJava;

import java.util.Arrays;

public class MaxOddValue {
    public static int filterUsingStream(int []arr){
        int maxOdd = Arrays.stream(arr)
                           .filter(x -> x%2 != 0)
                           .max()
                           .getAsInt();

        return maxOdd;
    }
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 2};
        int maxOdd = filterUsingStream(arr);
        System.out.println("Maximum odd Value : "+maxOdd);
    }
}

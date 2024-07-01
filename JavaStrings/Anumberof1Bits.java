package JavaStrings;

import java.util.Scanner;

public class Anumberof1Bits {
    public static int setBit(int num){
        int count=0;

        // Method 1
        // String str = Integer.toBinaryString(num);
        // for(int i=0; i<str.length(); i++){
        //     if(str.charAt(i) == '1'){
        //         count++;
        //     }
        // }

        // Method 2
        while (num > 0) {
            int rem=num%2;
            if(rem==1){
                count++;
            }
            num=num/2;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num=sc.nextInt();
        int res = setBit(num);
        System.out.println("The count of the set of the Bit Is : "+res);
    }
}

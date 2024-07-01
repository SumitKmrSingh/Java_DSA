package JavaStrings;

import java.util.Scanner;

public class LongestConsecutive1 { 
    public static int maxConsecutiveOnes(int num){
        String str = Integer.toBinaryString(num);
        System.out.println("Binary represtation of "+num+" : "+str);
        int count=0;
        int max1s=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '1'){
                count++;
            }
            
            if(str.charAt(i) == '0'){
                if(count > max1s){
                    max1s=count;
                    count=0;
                }
            }
        }
        return max1s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        int res = maxConsecutiveOnes(num);
        System.out.println("The longest consecutive ones : "+res);
    }
}

package JavaStrings;

import java.util.*;
public class CombineTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second String : ");
        String str2 = sc.nextLine();
        String str3 = str1 + str2;
        System.out.println("After Combinter : "+str1+" + "+str2+" : "+str3);
    }
}

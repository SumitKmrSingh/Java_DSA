package JavaStrings;

import java.util.Scanner;
public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str = sc.nextLine();
        System.out.println("String Before Removing Space : "+str);
       // String spaceRemoveStr = str.replace(" ", "");
        System.out.println("String After Removing Space : "+str.replace(" ", ""));
    }
}

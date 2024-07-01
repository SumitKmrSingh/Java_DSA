package JavaStrings;

import java.util.Scanner;
public class CheckVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Character : ");
        char ch = sc.next().charAt(0);
        if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'O' || ch == 'U' || ch == 'u'){
            System.out.println(ch+" Is Vowels");
        }
        else {
            System.out.print(ch+" Is not Vowels");
        }
    }
}
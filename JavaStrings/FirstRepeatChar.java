package JavaStrings;

import java.util.Scanner;
public class FirstRepeatChar {

    public static char firstRep(String str){
        char []ch = str.toCharArray();
        for(int i=0; i<ch.length; i++){
            for(int j=i+1; j<ch.length; j++){
                if(ch[i] == ch[j]){
                    return ch[i];
                }
            }
        }
        return '#';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String str = sc.nextLine();
        char res = firstRep(str);
        System.out.println("First Repeat Character In Given String : "+res);
    }
}

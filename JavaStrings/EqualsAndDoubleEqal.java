/* .equals() and == */

package JavaStrings;

public class EqualsAndDoubleEqal {
    public static void main(String[] args) {
        String s1 = new String("Sumit");
        String s2 = new String("Rahul");

        System.out.println(s1.equals(s2));  // false

        System.out.println(s1==s2);      // false

        String s3="Sumit";
        String s4="Sumit";

        System.out.println(s1.equals(s4));   // true

        String s5="Rahul";
        String s6="Sumit";

        System.out.println(s5==s6);   // false

        System.out.println(s5.equals(s6));    // false

        String s7 = new String("Rahul");
        String s8 = new String("Rahul");

        System.out.println(s7==s8);        // false
        System.out.println(s7.equals(s8));   // true
    }
}

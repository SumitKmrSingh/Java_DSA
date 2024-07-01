// Java program to demonstrate working of TreeSet Class

package CollectionFramwork.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        // Create an empty TreeSet
        TreeSet<String> tset = new TreeSet<>();

        // Adding elements to HashSet using add() method
        tset.add("geeks");
        tset.add("for");
        tset.add("Practice");
        tset.add("Contribute");

        // Duplicate elements being removed
        tset.add("geeks");

        System.out.println("TreeSet Contains : ");

        // Displaying TreeSet elements
        for(String str : tset){
            System.out.println(str);
        }
    }
}

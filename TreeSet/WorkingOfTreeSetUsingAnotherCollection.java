// Java Program to Illustrate Working of TreeSet From another Collection

package CollectionFramwork.TreeSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class WorkingOfTreeSetUsingAnotherCollection {
    public static void main(String[] args) {

        // Creating list of string
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to ArrayList using add() method
        al.add("Computer");
        al.add("Science");

        // Creating TreeSet object of string type
        TreeSet<String> ts = new TreeSet<>(al);

        // Adding elements to above TreeSet
        ts.add("GFG");
        ts.add("Protoal");

        // Iterating via iterators
        Iterator<String> it = ts.iterator();

        // Condition that holds true till there is single element in th List
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}

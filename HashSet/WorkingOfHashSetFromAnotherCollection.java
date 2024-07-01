// Java Program to Illustrate Working of HashSet Class From another Collection

package CollectionFramwork.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class WorkingOfHashSetFromAnotherCollection {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Computer");
        al.add("Science");

        HashSet<String> hset =new HashSet<>(al);
        hset.add("Protal");
        hset.add("GFG");

        Iterator it = hset.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

package CollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class ApnaHashSet {
    public static void main(String[] args) {

        // Create HashSet
        HashSet<Integer> set = new HashSet<>();

        // add Value In HashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(6);

        // Print HashSet Value
        System.out.println(set);

        // contains
        if(set.contains(1)){
            System.out.println("Exit");
        }

        if(!set.contains(6)){
            System.out.println("not Exit");
        }

        // remove()
        System.out.println(set.remove(6));
        

        // Iterator
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

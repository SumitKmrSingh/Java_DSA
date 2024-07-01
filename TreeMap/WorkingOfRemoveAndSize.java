// Example 2: Working of remove() and size().

package CollectionFramwork.TreeMap;

import java.util.TreeMap;

public class WorkingOfRemoveAndSize {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();
        t.put(10, "geeks");
        t.put(15, "IDE");
        t.put(5, "Courses");

        System.out.println(t);

         t.remove(10);
//        System.out.println(t.remove(10));

        System.out.println(t.size());
    }
}

package ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PrivousAndNextIndex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> it = list.listIterator(2);
        System.out.println(it.previousIndex());
        System.out.println(it.nextIndex());
    }
}

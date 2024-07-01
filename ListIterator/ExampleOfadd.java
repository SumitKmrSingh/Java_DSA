package ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExampleOfadd {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("List Before add : "+list);
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            it.add(5);
            it.next();
        }
        System.out.println("List after add : "+list);
    }
}

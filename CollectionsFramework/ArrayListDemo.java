package CollectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        ArrayList list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(true);
        list1.add("Sumit");
        list1.add(26.96);
        list1.add(null);
        list1.add(45);
        System.out.println(list1);

    }
}

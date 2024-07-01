package LinkListsDataStructure;

import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
       LinkedList<String> list = new LinkedList<>();

      list.addFirst("a");
      list.addFirst("Is");
      System.out.println(list);
      list.addFirst("This");
      System.out.println(list);
      list.addLast("List");

      // size of list
      System.out.println(list.size());

      for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i)+"->");
      }
      System.out.println();

      list.removeFirst();
      System.out.println(list);

      list.removeLast();
      System.out.println();

    //   list.remove(2);
      System.out.println(list);

    }
}

package CollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LearnArrayList {
    public static void main(String[] args) {

       /*  String []studentName = new String[31];

        studentName[0] = "Rakesh";
        //
        // studentName[1]....studentName[28]
        //
        studentName[30] = "Harish";
        
        //new Student
        studentName[31] = "Raman";  */

        // Creating ArrayList
       /*  ArrayList<String> studentName = new ArrayList<>();
        studentName.add("Rakesh");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);  // This will add 4 at the end of the list
        System.out.println(list);

        list.add(1,50);  // This will add 50 at Index 1
        System.out.println(list);

        ArrayList<Integer> newList = new ArrayList<>(); // Creating new List
        newList.add(100);
        newList.add(150);

        list.addAll(newList); // This will add all the element of newList Into list

        System.out.println(list);   // [1, 50, 2, 3, 4, 100, 150]

        System.out.println(list.get(1));    // 50    */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(80);
        list.add(90);

        System.out.println(list);

        list.set(2, 36);
        System.out.println(list);

        System.out.println(list.contains(36));
        System.out.println(list.contains(500));
        
        for(int i=0; i<list.size(); i++){
            System.out.println("the element is : "+list.get(i));
        }

        for(Integer element : list){
            System.out.println("for each element is : "+element);
        }

        // Iterator<Integer> it = new list.iterator();

        // while (it.hasNext()) {
        //     System.out.println("iterator : "+it.next());
        // }

        // System.out.println(list);

        // list.remove(1);
        // System.out.println(list);

        // list.remove(Integer.valueOf(30));
        // System.out.println(list);

        // list.clear();  // This will remove all the elements from the list
        // System.out.println(list);


        // Linkedlist

        System.out.println("Linkedlist");
        List<Integer> linkList = new LinkedList<>();
        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        System.out.println(linkList);
        

    }
}

package LinkListsDataStructure;

import java.util.LinkedList;

public class SearchData {

    public static int searchElement(LinkedList<Integer> list, int key){
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == key){
                return i+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        System.out.println("All Elements of Linked List are : "+list);

        // System.out.print("All elements of Linked List are : ");
        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i)+" ");
        // }

        int res = searchElement(list, 7);
        if(res > 0){
            System.out.println("7 Is present at "+res+" Index");
        }
        else{
            System.out.println("7 Is not Prestent In List");
        }
    }
}

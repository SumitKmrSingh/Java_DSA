package LinkListsDataStructure;

import java.util.LinkedList;

public class ApnaCollegeHW1 {
    public static int searchElements(LinkedList<Integer> list, int value){
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == value){
                return (i+1);
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

        System.out.println("All the elements of Linked List : "+list);
        int res = searchElements(list,7);
        if(res > 0){
            System.out.println("7 Is present at Index : "+res);
        }
        else {
            System.out.println("7 Is not Present In List");
        }

    }
}

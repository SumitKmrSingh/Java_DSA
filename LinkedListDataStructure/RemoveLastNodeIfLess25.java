package LinkListsDataStructure;

public class RemoveLastNodeIfLess25 {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Remove last node If It Is Greater than 25
    public void removeLastNodeIfGreater25(){
        if(head == null){
            System.out.println("List Is Empty");
            return;
        }
        Node currNode = head.next;
        Node preNode = head;

        while(currNode.next != null){
            currNode = currNode.next;
            preNode = preNode.next;
        }
        if(currNode.data > 25){
            preNode.next = null;
        }
    }

    // printList
    public void printList(){
        if(head == null){
            System.out.print("List Is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        RemoveLastNodeIfLess25 list = new RemoveLastNodeIfLess25();
        list.addFirst(86);
        list.addFirst(10);
       // list.printList();
        list.addFirst(20);
      //  list.printList();
        list.addFirst(30);
      // list.printList();
        list.addFirst(68);

        System.out.print("All the elements of List : ");
        list.printList();
        System.out.println();
        System.out.print("After removing list element If > 25 : ");
        list.removeLastNodeIfGreater25();
        list.printList();

    }
}

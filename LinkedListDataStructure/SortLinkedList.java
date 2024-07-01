package LinkListsDataStructure;

public class SortLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // print LinkedList
    public void printLinkedList(){
        if(head == null){
            System.out.println("List Is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        SortLinkedList list = new SortLinkedList();
        list.addFirst(14);
        list.addFirst(16);
        list.printLinkedList();
    }
}

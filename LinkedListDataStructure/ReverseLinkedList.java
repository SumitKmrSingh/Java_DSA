package LinkListsDataStructure;

class LinkedListReverse{
    Node head;
    class Node{
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

    // addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // reverse List
    public void reverseList(){
        if(head == null){
            System.out.println("List Is Empty");
            return;
        }

        Node prev = null;
        Node currNode = head;
        Node next = null;

        while(currNode != null){
            next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }
        head = prev;
    }

    // Print List
    public void printList(){
        if(head == null){
            System.out.println("List Is Empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

}

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedListReverse list = new LinkedListReverse();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        System.out.print("List Before Reverse : ");
        list.printList();
        System.out.println();
        System.out.print("List after Reverse : ");
        list.reverseList();
        list.printList();


    }
}

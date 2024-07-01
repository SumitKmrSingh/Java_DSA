package LinkListsDataStructure;

public class MainBasicOpeation {
    Node head = null;
    class Node {
        String data;
        Node next;

        // Constructor of Node Class
        Node(String data){
            this.data = data;
            this.next=null;
        }
    }
    // print list
    public void printList(){
        if(head == null){
            System.out.println("List Is empty ");
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    // delete first
    public void deleteFirst(){
        // If list Is empty
        if(head == null){
            System.out.println("List Is Empty");
        }
        head = head.next;
    }

    // deleteLast
    public void deleteLast(){
        // If list Is empty
        if(head == null){
            System.out.println("List Is Empty");
        }

        // If List Is not empty
        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            secondLast = secondLast.next;   // here, We can also write -> (secondLast = lastNode;)
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }

    // addLast
    public void  addLast(String data){
        Node newNode = new Node(data);

        // If head is null means list has no any node
        if(head == null){
            head = newNode;
            return;
        }

        // If list has node
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // addFirst
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return; 
        }         
        head = newNode;
    }
    public static void main(String[] args) {
        MainBasicOpeation list = new MainBasicOpeation();

        list.addFirst("Is");
        list.printList();
        System.out.println();

        list.addFirst("This");
        list.printList();
        System.out.println();

        list.addLast("a");
        list.printList();
        System.out.println();

        list.addLast("List");
        list.printList();
        System.out.println();

        list.deleteFirst();
        list.printList();
        System.out.println();

        list.deleteLast();
        list.printList();
        System.out.println();
    }
}

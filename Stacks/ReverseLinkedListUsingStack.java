package CollectionFramwork.Stack;


import java.util.Stack;

public class ReverseLinkedListUsingStack {

    // Create node of LinkedList
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;

    // add the elements In last
    public static void addLast(int data){
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

    public static void reverseList(){
        if(head == null){
            System.out.println("Linkded List Empty ");
            return;
        }

        // create stack
        Stack<Integer> stack = new Stack<>();
        Node currNode = head;

        // and store all the element of Linkded list Into the stack
        while (currNode != null){
            stack.push(currNode.data);
            currNode = currNode.next;
        }

        // Modified the head and again munally Intiallize head with zero (head = null)
        head = null;

        // Copy all the element of stack Into Linked List
        while(!stack.isEmpty()){
            addLast(stack.pop());
        }
    }

    // print all the elements of Linked List
    public static void printList(){
        if(head == null){
            System.out.println("Linked List Is Empty");
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        System.out.print("Linked List Before Reverse : ");
        printList();
        reverseList();
        System.out.print("Linked List after Reverse : ");
        printList();
    }
}

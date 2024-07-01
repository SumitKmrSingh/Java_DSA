/* Check if Linked List is Palindrome
 */

package LinkListsDataStructure;

public class CheckPalidromLinkedList {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
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

    // reverseList
    public Node reverseList(Node head){
        Node prev=null;
        Node currNode=head;
        Node next=null;

        while(currNode != null){
            next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }
        return prev;
    }

    // check Palidrome Linked-List
    public boolean isPalidrom(){
        Node temp = reverseList(head);
        Node currNode = head;
        while(temp != null && currNode != null){
            if(temp.data != currNode.data){
                return false;
            }
            temp = temp.next;
            currNode = currNode.next;
        }
        return true;
    }

    // printList
    public void printList(){
        if(head == null){
            System.out.println("List Is Empty");
            return;
        }
        
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        CheckPalidromLinkedList list = new CheckPalidromLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(1);
        // list.addLast(4);

        System.out.print("Linked-List Before Reverse : ");
        list.printList();
        System.out.println();
        System.out.print("Linked-List after Reverse : ");
        list.printList();
        System.out.println();

        boolean isPalidrome = list.isPalidrom();
        if(isPalidrome){
            System.out.println("Linked List are Palidrome");
        }
        else{
            System.out.println("Linked List are not Palidorme");
        }
    }
}

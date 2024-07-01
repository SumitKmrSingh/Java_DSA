/* Remove the first node If It Is Greater than 25 */

package LinkListsDataStructure;

public class FirstNodeLessThan25 {
    Node head;

    // Creating node
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
    public void adddLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curNode = head;
        while(curNode != null){
            curNode = curNode.next;
        }
        curNode=newNode;
    }

    // remove first node If It Is greater than 25
    public void removeFirstNodeIfGreaterThan25(){
        if(head == null){
            System.out.println("List Is Empty");
            return;
        }

        if(head.data > 25){
            head=head.next;
        }
        
    }

    // Print Linked list
    public void printList(){
        if(head == null){
            System.out.println("List Is empty");
            return;
        }

        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        FirstNodeLessThan25 list = new FirstNodeLessThan25();
        list.printList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(66);
        System.out.print("All the elements of List : ");
        list.printList();
        list.removeFirstNodeIfGreaterThan25();
        System.out.println();
        System.out.print("List Elements removing first node If first node data > 25 : ");
        list.printList();
    }
}

/* Take a elements numbers In the range (1-50) of a linkedlist as a Input from the
 * User. Delete all nodes which have values greater than 25.
 */

package LinkListsDataStructure;

public class RemoveNodes {
    Node head;
    class Node{
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

    // remove nodes which greater than 25
    public void removeNodeGreaterThan25(){
        if(head == null){
            System.out.println("List Is Empty");
            return;
        }

        Node currNode = head;
        Node prev = head;

        int count=0;
        while(currNode != null){
            if(currNode.data > 25){
                prev.next = currNode.next;
                prev = currNode.next;
            }
            currNode = currNode.next;
        }
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
        RemoveNodes list = new RemoveNodes();
        list.addLast(1);
        list.addLast(26);
        list.addLast(21);
        list.addLast(36);

        System.out.print("List Before removing nodes greater than 25 : ");
        list.printList();
        System.out.println();
        System.out.print("List after removing nodes greater than 25 : ");
        list.removeNodeGreaterThan25();
        list.printList();
    }
}

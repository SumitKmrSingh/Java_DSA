// Reverse a Linked List Using Stack

package LinkListsDataStructure;

import java.util.ArrayDeque;
import java.util.*;

import Stacks.ArrayImplemention.Stack;

public class ReverseLinkedListUsingStack {
    Node head=null;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // addLast
    public void adddLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curNode = head;
        while(curNode.next != null){
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    // pritnList
    public void printList(){
        if(head == null){
            System.out.println("List Is Empty");
            return;
        }

        Node curNode = head;
        while(curNode != null){
            System.out.print(curNode.data+"->");
            curNode = curNode.next;
        }
        System.out.println("null");
    }
    
    // Reverse Linked List Using Stack
    public void reverseList(){
        // Create a Stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Node curNode = head;

        // pushing all the elements of linked list In stack
        while (curNode != null) {
            stack.push(curNode.data);
            curNode = curNode.next;
        }

        head=null;
        // pop all the elements of stack and add In Linked List
        while (!stack.isEmpty()) {
            // System.out.print(stack.pop()+"->");
            adddLast(stack.pop());
        }
        // System.out.println("null");

    }
    public static void main(String[] args) {
        ReverseLinkedListUsingStack list = new ReverseLinkedListUsingStack();
        list.adddLast(1);
        list.adddLast(2);
        list.adddLast(3);
        list.adddLast(4);
        System.out.print("Linked List Before Reverse : ");
        list.printList();
        System.out.println();
        list.reverseList();
        System.out.print("Linked List after Reverse : ");
        list.printList();
    }
}

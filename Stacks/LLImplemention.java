package Stacks;

public class LLImplemention {

    public static class Node{  // User Define Data type
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static class LLStack{
        private Node head = null;
        private int size = 0;

        // push() Method
        void push(int val){
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
            size++;
        }

        // pop() Method
        int pop(){
            if(head == null){
                System.out.println("Stack Is Empty");
                return -1;
            }

            int top = head.val;
            head = head.next;
            size--;
            return top;

        }

        // peek() Method
        int peek(){
            if(head == null){
                System.out.println("Stack Is Empty");
                return -1;
            }

            int top = head.val;
            return top;
        }

        // display Reverse
        void displayRev(){
            if(head == null){
                System.out.print("Stack Is Empty");
                return;
            }
            Node curNode = head;
            while(curNode != null){
                System.out.print(curNode.val+" ");
                curNode = curNode.next;
            }
        }

        // display Stack
        void displayRec(Node h){
            if(h == null){
                return;
            }
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
        
        // display Stack
        void display(){
            System.out.print("Stack Elements are : ");
            displayRec(head);
        }

        int size(){
            return size;
        }

        // isEmpty() Method
        boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.display();
        System.out.println();

        st.push(5);
        st.display();
        System.out.println();

        st.push(1);
        st.display();
        System.out.println();
      //  st.displayRev();
        System.out.println();

        System.out.println("Peek Element In Stack : "+st.peek());
        System.out.println("Size of Stack : "+st.size());

        //st.pop();
        System.out.println("Stack Pop Element : "+st.pop());
        st.display();
        System.out.println();

        System.out.println("Size of Stack : "+st.size());

        st.push(7);
        st.push(10);
        st.push(14);
        System.out.println(st.isEmpty());
        st.push(100);
    }
}

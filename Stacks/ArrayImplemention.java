package Stacks;

public class ArrayImplemention {
    public static class Stack {
        private int []arr = new int[5];
        private int idx=0;

        // push() method
        void push(int x){
            if(isFull()){
                System.out.println("Stack Is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        // peek() method
        int peek(){
            if(idx == 0){
                System.out.println("Stack Is Empty");
                return -1;
            }
            int top = arr[idx-1];
            return top;
        }

        // pop() method
        int pop(){
            if(idx == 0){
                System.out.println("Stack Is Empty");
                return -1;
            }

            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;

            return top;
        }

        // display() method
        void display(){
            if(idx == 0){
                System.out.println("Stack Is Empty");
                return;
            }

            System.out.print("Stack Elements are : ");
            for(int i=0; i<=idx-1; i++){
                System.out.print(arr[i]+" ");
            }
        }

        // size() method
        int size(){
            return idx;
        }

        // isEmpty() method
        boolean isEmpty(){
            if(idx == 0){
                return true;
            }
            else {
                return false;
            }
        }

        // isFull()
        boolean isFull(){
            if(idx == arr.length){
                return true;
            }
            else {
                return false;
            }
        }

        // capacity()
        int capacity(){
            return arr.length;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.display();
        System.out.println();

        st.push(5);
        st.display();
        System.out.println();

        st.push(1);
        st.display();
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
        System.out.println(st.isFull());
        st.push(100);
    }
}

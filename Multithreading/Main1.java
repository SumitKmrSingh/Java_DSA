/* By extending Thread class */

package Multithreading;

class A extends Thread {
    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Sumit Rahul");
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        // A t = new A();
        // t.start();
        long start = System.currentTimeMillis();
        for(int i=1; i<=5; i++){
            System.out.println("Thakur Kumar");
        }
        long end = System.currentTimeMillis();
        System.out.println(System.nanoTime());   // System.nanoTime()
        long totalTime = end - start;
        System.out.println("Total time taken this Loop : "+totalTime);
    }
}

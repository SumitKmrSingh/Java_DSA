package Multithreading;

public class Client {
    public static void main(String[] args) {
        TaksUsingRunnable taksUsingRunnable = new TaksUsingRunnable();
        System.out.println("Inside Main Thread : "+Thread.currentThread().getName());
        Thread thread = new Thread(taksUsingRunnable);
        thread.start();
        System.out.println("I am In Main Method");
    }
}

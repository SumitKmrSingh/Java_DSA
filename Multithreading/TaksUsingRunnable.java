package Multithreading;

public class TaksUsingRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Inside run Thread : "+ Thread.currentThread().getName());
        System.out.println("I am In run method");
    }
}

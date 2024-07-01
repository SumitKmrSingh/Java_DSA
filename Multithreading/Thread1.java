package Multithreading;

class A extends Thread{
    @Override
    public void run(){
        try{
                for(int i=1; i<=5; i++){
                System.out.println("Child Thread");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){

        }
    }
}

public class Thread1 {
    public static void main(String[] args) throws InterruptedException{
        A t = new A();
        t.start();
        for(int i=1; i<=5; i++){
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
    }
}

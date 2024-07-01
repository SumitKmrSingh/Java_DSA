package Java_OOPS;

class A{
    // {
    //     System.out.println("Inside Inilizer Block");
    // }
    public A(){
        System.out.println("Inside Constructor");
    }
    public void m1(){
        System.out.println("Inside main Method");
    }
}

public class TestConstr {
    public static void main(String[] args) {
        System.out.println("Inside main Method");
        new A();
    }
}

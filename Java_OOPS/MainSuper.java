package Java_OOPS;

class A{
    int x=0;
    public A(){
        System.out.println("I am Constructor of Parent class");
    }

    public void parentMethod(){
        System.out.println("I am Method of A class");
    }
}

class B {
    B(){
        System.out.println("I am Constructor of Child class");
    }

    public void childMethod(){
        System.out.println("I am Method of B class");
    }
}

public class MainSuper {
    public static void main(String[] args) {
        B obj = new B();
        A objA = new A();
        // obj.childMethod();
    }
}

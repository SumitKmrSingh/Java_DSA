package Java_OOPS;

class Parent
{
    static {
        System.out.println("I am In Parent Class");
    }
}

class Child
{
    static {
        System.out.println("I am In Child class");
    }
}

public class TestInheritence {
    
    public static void main(String[] args) {
        Child obj = new Child();
    }
}

package Java_OOPS;

class A {

    int x;
    int y;

    A(int a, int b){
        x=a;
        y=b;
    }

    A(int a, String b){
        System.out.println(a+" "+b);
    }

    void show(){
        System.out.println(x+" "+y);
    }
}
public class MainOverloadConstructor {
    public static void main(String[] args) {
        A r = new A(100,200);
        A ref = new A(10, "ankush");
        r.show();
    }
}

package Java_OOPS;

class Shape {
    void draw(){
        System.out.println("Can't Say Shape Type");
    }
}

class Square extends Shape {
    @Override
    void draw(){
        super.draw();
        System.out.println("Square Shape");

    }
}

public class InheritenceShape {
    public static void main(String[] args) {
        Shape r = new Square();
        r.draw();
    } 
}

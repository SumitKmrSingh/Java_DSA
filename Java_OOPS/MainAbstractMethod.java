package Java_OOPS;

abstract class Programming {
    public abstract void developer();   
}

class HTML {
    public void developer(){
        System.out.println("I am HTML Developer");
    }
}

class Java {
    public void developer(){
        System.out.println("I am Java Developer");
    }
}

public class MainAbstractMethod {
    public static void main(String[] args){
        HTML h = new HTML();
        Java j = new Java();
        h.developer();
        j.developer();
    }
}

package Java_OOPS;

abstract class Programming {
    public abstract void developer(); 
    public abstract void rank();  
}

class HTML  {
    public void developer(){
        System.out.println("I am HTML Developer");
    }
}

class Java {
    public void developer(){
        System.out.println("I am Java Developer");
    }
}

public class MainAbstract2 {
    public static void main(String[] args) {
        HTML h = new HTML();
        h.developer();
    }
}

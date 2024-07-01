/* In one class we can create n number of static Block here are the example of that */

package Java_OOPS;

public class StaticBlockDemo {

    private int x = 10;
    private static int y = 40;

    static {
        System.out.println("Main Static 1 Block Called");
    }

    static {
        System.out.println("Main Static 2 Block Called");
    }

    static {
        System.out.println("Main Static 3 Block Called");
    }

    static {
        System.out.println("Main Static 4 Block Called");
    }

    public static void main(String[] args) {
        System.out.println(y);
    }
}

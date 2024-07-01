package CollectionsFramework;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("dog");
        animals.push("Horsh");
        animals.push("cat");

        System.out.println(animals);

        System.out.println(animals.peek());

        animals.pop();
        System.out.println(animals.peek());
    }
    
}

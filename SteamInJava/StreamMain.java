package SteamInJava;

import java.util.Arrays;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        // Create a list using asList()
        List<Integer> l = Arrays.asList(5, 10, 20, 30, 8, 7);

        // Taking a list as a source
        // Applying stream
        // filtering out the even number
        // filtering out the number > 10
        // printing the list
        l.stream()
         .filter(x -> x%2 == 0)
         .filter(x -> x > 10)
         .forEach(System.out::println);
    }
}

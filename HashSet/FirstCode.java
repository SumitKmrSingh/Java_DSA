// // Java Program to Demonstrate Working of HashSet Class

package CollectionFramwork.HashSet;

import java.util.HashSet;

public class FirstCode {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();
        hset.add("Geeks");
        hset.add("for");
        hset.add("Practice");
        hset.add("Contributer");

        hset.add("Geeks");

        System.out.println("HashSet Contains : ");

        for(String str : hset){
            System.out.println(str+" ");
        }
    }
}

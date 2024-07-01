package CollectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Anuj", 2));
        studentSet.add(new Student("Ramesh", 4));
        studentSet.add(new Student("Shivam", 3));

        studentSet.add(new Student("Rohit", 2));

        Student s1 = new Student("Anuj", 2);
        Student s2 = new Student("Rohit", 2);

        System.out.println(studentSet);

        System.out.println(s1.equals(s2));


        //HashSet
        System.out.println("HashSet()");
        Set<Integer> set = new HashSet<>();

        set.add(32);
        set.add(44);
        set.add(63);
        set.add(96);

        System.out.println(set);

        set.remove(44);
        System.out.println(set);

        System.out.println(set.contains(100)); //false
        System.out.println(set.contains(96)); // true

        System.out.println(set.isEmpty());    //false
        System.out.println(set.size());  //size() -> It reurn total number of element In set
        
        set.clear();   // It clear all the element from the set
        System.out.println(set);

        // LinkedHashSet -> Here order of element Is Maintained
        System.out.println("LinkedHashSet()");
        Set<Integer> lSet = new LinkedHashSet<>();

        lSet.add(32);
        lSet.add(44);
        lSet.add(63);
        lSet.add(96);

        System.out.println(lSet);

        lSet.remove(44);
        System.out.println(lSet);

        System.out.println(lSet.contains(100)); //false
        System.out.println(lSet.contains(96)); // true

        System.out.println(lSet.isEmpty());    //false
        System.out.println(lSet.size());  //size() -> It reurn total number of element In set
        
        lSet.clear();   // It clear all the element from the set
        System.out.println(lSet);

        //TreeSet 
        System.out.println("TreeSet()");
        Set<Integer> tSet = new TreeSet<>();

        tSet.add(32);
        tSet.add(44);
        tSet.add(63);
        tSet.add(96);
        tSet.add(1);

        System.out.println(tSet);

        tSet.remove(44);
        System.out.println(tSet);

        System.out.println(tSet.contains(100)); //false
        System.out.println(tSet.contains(96)); // true

        System.out.println(tSet.isEmpty());    //false
        System.out.println(tSet.size());  //size() -> It reurn total number of element In set
        
        tSet.clear();   // It clear all the element from the set
        System.out.println(tSet);

    }
    
}

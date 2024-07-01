package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // list.add(34);
        // list.add(12);
        // list.add(9);
        // list.add(76);
        // list.add(29);
        // list.add(75);

        // System.out.println("Min Element : "+Collections.min(list));
        // System.out.println("Max Element : "+Collections.max(list));

        // System.out.println("frequency : "+Collections.frequency(list, 9));

        // Collections.sort(list,Comparator.naturalOrder());
        // System.out.println(list);

        // Collections.sort(list, Comparator.reverseOrder());
        // System.out.println(list);

        List<Student> list = new ArrayList<>();
        list.add(new Student("Anuj", 3));
        list.add(new Student("Rahul", 2));
        list.add(new Student("Sumit", 1));
        list.add(new Student("Vikash", 4));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Student s1 = new Student("Anuj", 2);
        Student s2 = new Student("Rohit", 3);

        System.out.println(s1.compareTo(s2));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2){
                return o1.name.compareTo(o2.name);
            }
        });

        System.out.println(list);
    }
    
}

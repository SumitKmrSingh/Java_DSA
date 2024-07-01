package CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("one", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);

        System.out.println(numbers);            // {one=1, Two=2, Three=3}

        numbers.put("Two", 26);

        System.out.println(numbers);         // {one=1, Two=26, Three=3}

        if(!numbers.containsKey("Three")){
            numbers.put("Three", 3);    
        }

        System.out.println(numbers);      // {one=1, Two=26, Three=3}

        numbers.putIfAbsent("one", 14);
        System.out.println(numbers);              // {one=1, Two=26, Three=3}

        //Iteration on map
        for(Map.Entry<String, Integer> e : numbers.entrySet() ){
            System.out.println(e);

            System.out.println(e.getKey());

            System.out.println(e.getValue());
        }

        // get only key set
        for(String key : numbers.keySet()){
            System.out.println(key);
        }

        // get only value set
        for(Integer value : numbers.values()){
            System.out.println(value);
        }

        //containsValue()
        System.out.println(numbers.containsValue(4));   // true

        System.out.println(numbers.containsValue(32));  // false

        System.out.println(numbers.isEmpty());    //false
    }
    
}

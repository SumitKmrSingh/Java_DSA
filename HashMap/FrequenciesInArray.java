// Sample Problem: Frequencies in Array in Java

/* Problem: Given an array that may contain duplicates, print all elements, and their frequencies.

Note: Order of elements in output doesn't matter.

Examples:
Input :  arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
Output : 10 3
         20 4
         5  1
10 appears 3 times in the array.
20 appears 4 times in the array.
5 appears once in the array.

Input : arr[] = {10, 20, 20}
Output : 10 1
         20 2

Efficient Solution: To solve this problem efficiently, we can use HashMap in Java. The idea is to
store element as key and its frequency as value as a key-value pair in HashMap.
    Traverse through the array.
    If the current element exists in the HashMap, increment its frequency in the HashMap.
    Otherwise, insert this element as key with value 1 in the HashMap.
    Finally, traverse the HashMap and print all elements with frequency.
          */

package CollectionFramwork.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FrequenciesInArray {
    public static void printFrequencies(int []arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i< arr.length; i++){
//            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

//        for(Map.Entry x : map.entrySet()){
//            System.out.println(x.getKey()+" "+x.getValue());
//        }

        for(int x : map.keySet()){
            System.out.println(x+" "+map.get(x));
        }

    }
    public static void main(String[] args) {
        int []arr = {10, 20, 20, 10, 10, 20, 5, 20};
        printFrequencies(arr);
    }
}

/* Time Complexity: θ(N)
   Auxiliary Space: θ(N) */
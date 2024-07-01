// Sample Problem: Print Frequencies in an Order

/* Problem: Given an array of integers, the task is to print the frequencies of elements of the
array in the order they appear in the array. That is the element that appeared first, print
frequency of it before the element which appeared after it in the array.

Example:
Input: arr[] = {10, 15, 20, 15, 10, 15}
Output:
10 2
15 3
20 1

Input: arr[] = {10, 10, 20, 20, 20, 10, 10}
Output:
10 4
20 2



We discussed a similar problem before for which the order of output doesn't matter. Let's try to
modify the approach in that problem to solve this problem.

Method 1: We can use a HashMap to store frequencies for every element as discussed in the previous
article.
Traverse through the array.
If the current element exists in the HashMap, increment its frequency in the HashMap.
Otherwise, insert this element as key with value 1 in the HashMap.


Now, to ensure that we print elements with frequencies in the same order they appear in the input
array, we can traverse the input array again, and initialize its frequency as -1 in the HashMap
after printing it. By doing this, we can ensure that we don't print the frequency of it again for
its further occurrences. */

package CollectionFramwork.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class PrintFrequenciesInAnOrder {

    public static void printFrequencies(int []arr){
        // By Using HashMap

//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i=0; i<arr.length; i++){
////            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//              if (map.containsKey(arr[i])){
//                  map.put(arr[i], map.get(arr[i])+1);
//              }
//              else {
//                  map.put(arr[i], 1);
//              }
//        }
//
//        for(int i=0; i<arr.length; i++){
//            int freq = map.get(arr[i]);
//            if(freq != -1){
//                System.out.println(arr[i]+" "+map.get(arr[i]));
//                map.put(arr[i], -1);
//            }
//        }

        // By using LinkedHashMap -> we Known LinkedHashMap follow Insertion order
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i=0; i< arr.length; i++){
//            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> x : map.entrySet() ){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }

    public static void main(String[] args) {
        int []arr = {10, 20, 20, 10, 10, 20, 5, 20};
        printFrequencies(arr);
    }
}

//  Time Complexity: θ(N)
//  Auxiliary Space: O(N)
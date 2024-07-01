//Sample Problem: Print distinct elements in Java

/* Problem: Given an unsorted integer array, print all distinct elements in an array.
The given array may contain duplicates and the output should print every element only once.

Input: arr[] = {4, 8, 5, 8, 7, 5}
Output: {4, 8, 5, 7}

Input: arr[] = {10, 8, 4, 10, 10, 4}
Output: {10, 8, 4}

Explanation: The repetitions have been removed.



Approach:

Step 1: Create a HashSet.

Step 2: Traverse the given array from left to right and check if it is present in the
HashSet or not.

Step 3: If the current element does not exists in the HashSet, print the current element
and insert it to the HashSet. */

package CollectionFramwork.HashSet;

import java.util.HashSet;

public class DistinctElements {
    public static void printDist(int []arr){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i< arr.length; i++){
            if(hashSet.contains(arr[i]) == false){
                System.out.print(arr[i]+" ");
                hashSet.add(arr[i]);
            }

        }
    }
    public static void main(String[] args) {
        int []arr = {10, 8, 4, 10, 10, 4};
        printDist(arr);
    }
}

/* Sample Problem : Print repeating elements in Java

  Problem: Given an array of integers, find and print all those elements of an array which are
  repeated.



Input: arr[] = {10, 8, 10, 7, 7, 6}
Output: {10, 7}
Here 10 and 7 are the only elements repeated.

Input: arr[] = {10, 20, 10, 10}
Output: 10, 10
First 10 at index 0 is repeated at index 2.
Second 10 at index 2 is repeated at index 3.

Input: arr[] = {2, 2, 2, 2}
Output: 2, 2, 2


We can also define an element at index i as a repeating element if it has appeared before
the index i.

Naive Solution: The most simple solution is to use two nested loops to check if an element
at index i has appeared before or not.

Time Complexity: O(N*N)
Auxiliary Space: O(1)

Efficient Solution:
The idea to reduce the time complexity is to use a HashSet.


Step 1: Create a HashSet.
Step 2: Traverse the array and print the element if it already exists in the HashSet otherwise
insert in the HashSet. This will take care of the repetitions and will print the element if it
again occurs in the set. Only, the first time due to the emptiness of the set, the first element
will be inserted by default.
 */

package CollectionFramwork.HashSet;

import java.util.HashSet;

public class PrintRepeatingElements {
    public static void printRepeating(int []arr){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0; i<arr.length; i++){
            if(hashSet.contains(arr[i]) == true){
                System.out.print(arr[i]+" ");
//                hashSet.remove(arr[i]);
            }
            else {
                hashSet.add(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {10, 20, 10, 10};
        printRepeating(arr);
    }
}

// Sample Problem: Intersection of two Arrays in Java

/* Problem: Find the Intersection of two unsorted arrays. Assume that the arrays are unique and
any single array does not contain repeated items.

Example:
Input: arr1[] = {7, 2, 9, 15, 10}
       arr2[]: {5, 10, 7, 3, 2, 20, 9}
Output: {7, 10, 2, 9}

Input: arr1[] = {7, 1, 5, 2, 3, 6}
       arr2[] = {3, 8, 6, 20, 7}
Output: {7, 3, 6}
*/

package CollectionFramwork.HashSet;

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void printIntersect(int []arr1, int []arr2){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i< arr2.length; i++){
            hashSet.add(arr2[i]);
        }

        for(int i=0; i< arr1.length; i++){
            if(hashSet.contains(arr1[i])){
                System.out.print(arr1[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int []arr1 = {7, 2, 9, 15, 10};
        int []arr2 = {5, 10, 7, 3, 2, 20, 9};
        printIntersect(arr1, arr2);
    }
}


/* Time Complexity: The loop used to insert elements into an unordered_set from arr2[] will
take O(n) time. The second loop used to find and print the elements of arr1[] will take O(m) times.
The overall time complexity of the program will be O(m) + O(n) which is equivalent to O(m+n) times.
This is better than Approach 1 and Approach 2 as this performs the operation in linear time.
Auxiliary Space: Creation of an unordered set will take O(n) space. */

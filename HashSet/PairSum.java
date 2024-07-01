// Sample Problem: Pair Sum in Java

/* Problem: Check whether any pair's sum in an array matches to the given 'sum'. Return true or
1 if a match is found else return false or 0.

Examples:
Input: arr[] = {5, 9, 8, 13, 2, 4}, sum = 7
Output: True
Explanation: 5 + 2 = 7

Input: arr[] = {5, 9, 8, 13, 2, 4}, sum = 3
Output: False
Explanation: No pairs sum = 3



Approach:
The problems could have been easily solved using nested for loops but that would result in increased
time complexity. Using a HashSet, one can optimize the time complexity for this problem.
To do this first create an empty HashSet. Traverse the array and perform the following operations.
Find the difference between the sum and the current_element of the array and check whether the
difference is present in the HashSet or not. Also, add the current_element into the HashSet for
upcoming verifications. This process can be precisely broken down into the following steps:

Step 1: Create a HashSet.
Step 2: Find the complement i.e., sum - arr[current_element].
Step 3: If the complement is present in the HashSet, return true.
Step 4: Insert the current_element into the HashSet.
Step 5: Repeat Step 2 to Step 4 until full array is traversed. */

package CollectionFramwork.HashSet;

import java.util.HashSet;

public class PairSum {
    public static boolean checkForPair(int []arr, int sum){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i< arr.length; i++){
            int complement = sum - arr[i];
            if(hashSet.contains(complement)){
                return true;
            }
            hashSet.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr = {5,9, 8, 13, 2, 4};
        int sum=7;
        boolean res = checkForPair(arr, sum);
        System.out.println(res);
    }
}

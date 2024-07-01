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



Naive Solution: A simple solution is to run two loops. For every item count number of times,
it occurs. To avoid duplicate printing, keep track of processed items.

To avoid counting and printing frequencies of duplicate elements, we can simply run a loop on
left of that element to check if it has occurred previously. */

package CollectionFramwork.HashMap;

public class FrequenciesInArrayNiveSolutions {
    public static void printFrequencies(int []arr){
        for(int i=0; i<arr.length; i++){
            boolean flag = false;
            for (int j=0; j<i; j++){
                if (arr[j] == arr[i]){
                    flag = true;
                    break;
                }
            }

            if (flag == true){
                continue;
            }

            int count=1;
            for (int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);
        }
    }
    public static void main(String[] args) {
        int []arr = {10, 20, 20, 10, 10, 20, 5, 20};
        printFrequencies(arr);
    }
}


// The time complexity of the above solution is O(N*N) in worst case.
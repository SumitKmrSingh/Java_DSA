/* Problem: Given an integer N, the task is to print the first N numbers in increasing order formed using digits 5 and 6.

Example:
Input: N = 10
Output: 5, 6, 55, 56, 65, 66, 555, 556, 565, 566

Input: N = 4
Output: 5, 6, 55, 56

Input: N = 2
Output: 5, 6

 Time Complexity: O(N)
Auxiliary Space: O(N)
 */

package CollectionFramwork.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateNumberUsing5And6 {
    public static void printFirstN(int num){
        Queue<String> q = new LinkedList<>();
        q.offer("5");
        q.offer("6");
        for(int i=0; i<num; i++){
            String curr = q.poll();
            System.out.print(curr+" ");
            q.offer(curr+"5");
            q.offer(curr+"6");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num=sc.nextInt();
        printFirstN(num);
    }
}

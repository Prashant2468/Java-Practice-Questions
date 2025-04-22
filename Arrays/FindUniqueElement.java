/*
Definition : Given a unsorted array arr[] of positive integers having all the numbers occurring exactly twice, 
             except for one number which will occur only once. Find the number occurring only once.

Examples :
Input: arr[] = [1, 2, 1, 5, 5]
Output: 2
Explanation: Since 2 occurs once, while other numbers occur twice, 2 is the answer.

*/

import java.util.*;
class FindUniqueElement {
    public static void main(String[] args) {
        int[] arr={1,2,1,5,5};
        int uniqueElement=findUnique(arr);
        System.out.println(uniqueElement);
    }
    
     public static int findUnique(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // First pass: count frequencies
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Second pass: find the first element with frequency 1
        for (int num : arr) {
            if (freq.get(num) == 1) {
                return num;
            }
        }
        return -1; // Return -1 if no unique element foun
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)

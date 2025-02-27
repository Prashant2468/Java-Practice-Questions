
/*
 * Definition : Find the Mejority Element from the Array
 * Examples:
 * Input: nums = [3,2,3]
 *  Output: 3
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */

 /*
  * Solution : 1
  */
  
import java.util.Scanner;

public class MajorityElement {

    public static void main(String[] args) {
        // int[] nums = {2, 3, 2, 3, 2, 4, 4, 4, 4, 4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number of elements that you wants to add:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " Elements : ");
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            nums[i] = a;
        }
        System.out.println("Majority Element is :  " + majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {

        int count = 0, maxCount = 0;
        int majority_element = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                majority_element = nums[i];
            }
            count = 0;
        }
        return majority_element;
    }
}

/*
 * Solution : 2
 */
//  import java.util.HashMap;
// public class MajorityElement {
//     public static void main(String[] args) {
//         int[] nums = {2, 3, 2, 3, 2, 4, 4, 4, 4, 4};
//         System.out.println(majorityElement(nums));
//     }
//     public static int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> countMap = new HashMap<>();
//         int maxCount = 0, majorityElement = 0;
//         for (int num : nums) {
//             countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//             if (countMap.get(num) > maxCount) {
//                 maxCount = countMap.get(num);
//                 majorityElement = num;
//             }
//         }
//         return majorityElement;
//     }
// }


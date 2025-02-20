/*Definition : Write a program to find Peak Element from the given array
               Peak Element: A peak element is an element that is strictly
               greater than its neighbours.
1.2. Examples:
    
    Input: nums = [1,2,3,1]
    Output: 2
    Explanation: 3 is a peak element and your function should
    return the index number 2.
    
    Input: nums = [1,2,1,3,5,6,4]
    Output: 1, 5
    Explanation: Your function can return index number 1
    where the peak element is 2 and index number 5 where the
    peak element is 6.
 */
public class PeekElement {

    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 41, 5};
        peekElement(arr);
    }

    public static void peekElement(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            // Check if it's the first element
            if (i == 0 && arr[i] > arr[i + 1]) {
                System.out.print(i + " ");
            } // Check if it's the last element
            else if (i == arr.length - 1 && arr[i] > arr[i - 1]) {
                System.out.print(i + " ");
            } // Check if it's a middle element and a peak element
            else if (i > 0 && i < arr.length - 1 && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.print(i + " ");
            }
        }
    }
}

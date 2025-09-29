/*
Definition : Find the minimum number of operations required to make all elements of an array equal to a single chosen number,
where each operation consists of either increasing or decreasing an element by 1.

Input : [1,2,10,9]
Output : 16
//  you can level up with 9 

arr[0] increase by 1 , 8 times to become 9 = 8 
arr[1] increase by 1 , 7 times to become 9 = 7
arr[10] decrease by 1 , 1 times to become 9 = 1 and  
arr[9] no need to do any operation , already 9 = 0

so total = 8 + 7 + 1 + 0 = 16 operations are needed to level up the arrays 
*/
import java.util.*;
class LevelUpTheNumbers {
    public static void main(String[] args) {
        int[] arr={3,2,1};
        Arrays.sort(arr);
        int middle=arr[arr.length/2];
        int totalOperations=0;
        for(int i=0;i<arr.length;i++){
            totalOperations+=(Math.abs(arr[i]-middle));
        }
        System.out.println(totalOperations);
    }
}
